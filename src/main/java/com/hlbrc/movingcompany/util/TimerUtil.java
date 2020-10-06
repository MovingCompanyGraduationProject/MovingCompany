package com.hlbrc.movingcompany.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.hlbrc.movingcompany.entity.CompanyMessage;
import com.hlbrc.movingcompany.entity.CompanyMessageExample;
import com.hlbrc.movingcompany.entity.User;
import com.hlbrc.movingcompany.entity.UserExample;
import com.hlbrc.movingcompany.enums.IMyEnums;
import com.hlbrc.movingcompany.mapper.ICompanyMessageMapper;
import com.hlbrc.movingcompany.mapper.IUserMapper;

import net.sf.json.JSONObject;

 
/**
* @Author: DELL
* @Description:
* @Date: 2020/05/08
* @Modified By:
* @Modified Date:
*/
public class TimerUtil implements ServletContextListener {
	/**
	 * 延时执行检验身份证正反面
	 * @param idCardSide 正面 front 国徽面 back
	 * @param filePath 图片路径
	 * @param time 延迟时长 毫秒为单位
	 * @param message json串
	 * @param user_mapper IUserMapper对象
	 */
	public static void checkIdCard(String idCardSide,String filePath,Integer time,String message,IUserMapper user_mapper){
		Timer nTimer = new Timer();
		nTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				String result = Idcard.idcard(idCardSide,filePath);
				JSONObject result_json = JSONObject.fromObject(result);
				JSONObject json = JSONObject.fromObject(message);
				if("front".equals(idCardSide)) {
					User user = new User();
					UserExample example = new UserExample();
					UserExample.Criteria criteria = example.createCriteria();
					if("1".equals(result_json.getString("idcard_number_type"))&&"normal".equals(result_json.getString("image_status"))) {
						String name = result_json.getJSONObject("words_result").getJSONObject("姓名").getString("words");
						String idnumber = result_json.getJSONObject("words_result").getJSONObject("公民身份号码").getString("words");
						if(name.equals(json.getString("name"))&&idnumber.equals(json.getString("numberid"))) {
							if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
								criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
								int day=Integer.parseInt(idnumber.substring(10,14));
								int age=Time.Getyear()-Integer.parseInt(idnumber.substring(6,10));
								int disid = Integer.parseInt(idnumber.substring(0,6));
								if(Integer.parseInt(Time.Getmonth()+Time.Getday())<day)
									 age=age-1;		
								//通过身份证号码判断性别
								String sex;
								if(Integer.parseInt(idnumber.substring(16,17))%2==0)
									sex="女";
								else
									sex="男";
								user.setAge(age);
								user.setSex(sex);
								user.setIdnumber(idnumber);
								user.setDisid(disid);
								user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
								user.setIdcardz(json.getString("idcardz"));
								user.setIdcardf(json.getString("idcardf"));
								user.setApprovestate(IMyEnums.CERTIFICATION_STATUS_AUTHENTICATED);
								int i = user_mapper.updateByExampleSelective(user, example);
								if(i>0) {
									System.err.println("修改成功！");
								}
								else {
									System.err.println("修改失败！");
								}
							}
						}
						else {
							if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
								criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
							}
							user.setApprovestate(IMyEnums.CERTIFICATION_STATUS_FAIL);
							user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
							int i = user_mapper.updateByExampleSelective(user, example);
							if(i>0) {
								System.err.println("修改成功！");
							}
							else {
								System.err.println("修改失败！");
							}
						}
					}
					else {
						if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
							criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
						}
						user.setApprovestate(IMyEnums.CERTIFICATION_STATUS_FAIL);
						user.setUpdatetime(new Timestamp(new Date().getTime()).toString());
						int i = user_mapper.updateByExampleSelective(user, example);
						if(i>0) {
							System.err.println("修改成功！");
						}
						else {
							System.err.println("修改失败！");
						}
						
					}
				}
				//结束
				System.gc();
				cancel();
			}
		},time);
	}
	
	/**
	 * 延时校验营业执照
	 * @param filePath 图片路径
	 * @param time 延迟时长 毫秒为单位
	 * @param message json串
	 * @param company_message_mapper
	 */
	public static void checkBusinessLicense(String filePath,Integer time,String message,ICompanyMessageMapper company_message_mapper){
		Timer nTimer = new Timer();
		nTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				CompanyMessage record = new CompanyMessage();
				CompanyMessageExample example = new CompanyMessageExample();
				CompanyMessageExample.Criteria criteria = example.createCriteria();
				String result = BusinessLicense.businessLicense(filePath);
				JSONObject result_json = JSONObject.fromObject(result);
				JSONObject json = JSONObject.fromObject(message);
				String name = result_json.getJSONObject("").getJSONObject("").getString("");
				String number = result_json.getJSONObject("").getJSONObject("").getString("");
				if(json.getString("name").equals(name)&&json.getString("number").equals(number)) {
					if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
						criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
					}
					record.setBusinesslicense(json.getString("businesslicense"));
					record.setApprovestate(IMyEnums.CERTIFICATION_STATUS_AUTHENTICATED);
					record.setUpdatetime(new Date());
					company_message_mapper.updateByExampleSelective(record, example);
				}
				else {
					if(json.getString("userid")!=null&&!"".equals(json.getString("userid"))) {
						criteria.andUseridEqualTo(Integer.parseInt(json.getString("userid")));
					}
					record.setApprovestate(IMyEnums.CERTIFICATION_STATUS_FAIL);
					record.setUpdatetime(new Date());
					company_message_mapper.updateByExampleSelective(record, example);
				}
			}
		},time);
	}
 
	/**
	* 延迟5000毫秒，每1000毫秒执行一次
	*/
	public static void timer2() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
			System.out.println("-------延迟5000毫秒，每1000毫秒执行一次--------");
			}
		}, 5000, 1000);
	}
	
	/**
	* 延迟5000毫秒，每1小时执行一次
	*/
	public static void timer3() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.err.println("-------延迟5000毫秒，每1小时执行一次--------");
				
			}
		}, 10000, 1000 * 60 * 60 * 2);
	}
 
	/**
	* 设置24：00执行任务
	* java.util.Timer.scheduleAtFixedRate(TimerTask task, Date firstTime, long period)
	*/
	public static void timer4() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 24);
		calendar.set(Calendar.MINUTE, 40);
		calendar.set(Calendar.SECOND, 0);
		Date time = calendar.getTime();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sd.format(time));
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println("-------设定要指定任务--------");
			}
		}, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
		//1000 * 60 * 60 * 24
	}
	
	//服务器关闭的时候执行的
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
	
	//服务器启动的时候执行的
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
	}
}