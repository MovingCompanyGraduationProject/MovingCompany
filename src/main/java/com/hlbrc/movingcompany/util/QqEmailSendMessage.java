package com.hlbrc.movingcompany.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.HtmlEmail;

public class QqEmailSendMessage {
	/**
	 * 纯文本
	 * @return
	 */
	public static boolean sendEmail(String receiver,HttpServletRequest request){
	    try {
	        //创建网页邮箱对象
		    HtmlEmail email=new HtmlEmail();
		    //基本设置
		    email.setDebug(true);
		    //设置为QQ邮箱作为发送主邮箱
		    email.setHostName("SMTP.qq.com");
		    email.setSmtpPort(587);
		    //qq邮箱的验证信息
		    email.setAuthentication("hlbrc.diplomaproject@foxmail.com","uhygapoqnfmydjjd");
		    //设置邮件发送人
		    email.setFrom("hlbrc.diplomaproject@foxmail.com");
		    //设置邮件接收人
		    email.addTo(receiver);
		    int mobile_code1 = (int)((Math.random()*9+1)*100000);
		    String mobile_code = mobile_code1+"";
		    HttpSession session = request.getSession();
		    //发送session设置失效时间
		    session.setAttribute("appEmailVerifyCode", mobile_code);
		    session.setAttribute("email", receiver);
		    session.setMaxInactiveInterval(60*5);
		    //设置发送的内容
		    email.setContent("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。验证码将在5分钟后失效！", "text/html;charset=UTF-8");
		    //设置邮箱标题
		    email.setSubject("巧瓜搬家网");
		    //执行邮件发送
	        System.err.println(email.send());
	        return true;
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return false;
	}

	
	/**
	 * 生成一份本地的邮件
	 * @param args
	 * @throws MessagingException 
	 * @throws IOException 
	 */
	public static boolean setCon(String replay) {
		try {
		    //环境
		    Session session = Session.getDefaultInstance(new Properties());
		    //邮件
		    MimeMessage msg = new MimeMessage(session);
		    msg.addHeader("X-Mailer","Microsoft Outlook Express 6.00.2900.2869");
		    //设置主题
		    msg.setSubject("通知");
		    //发件人，注意中文的处理
		    msg.setFrom(new InternetAddress("\"" + MimeUtility.encodeText("会员管理系统") + "\"<hlbrc.diplomaproject@foxmail.com>"));
		    //设置邮件回复人
		    msg.setReplyTo(new Address[]{new InternetAddress(replay)});
		    //整封邮件的MINE消息体
		    MimeMultipart msgMultipart = new MimeMultipart("alternative");//混合的组合关系
		    //设置邮件的MINE消息体
		    msg.setContent(msgMultipart);
		    //正文内容
		    MimeBodyPart content = new MimeBodyPart();
		    //把内容加入到 MINE消息体中
		    msgMultipart.addBodyPart(content);
		    //正文（图片和文字部分）
		    //"related"可以携带各种附件外，还可以将其它内容以内嵌资源的方式存储在邮件中
		    MimeMultipart bodyMultipart  = new MimeMultipart("alternative");
		    //设置内容为正文
		    content.setContent(bodyMultipart);
		    //html代码部分
		    MimeBodyPart htmlPart = new MimeBodyPart();
		    //正文添加图片和html代码
		    bodyMultipart.addBodyPart(htmlPart);
		    //html中嵌套的图片部分
		    MimeBodyPart imgPart = new MimeBodyPart();
		    //说明html中的img标签的src，引用的是此图片
		    imgPart.setHeader("Content-Location", "/cgi-bin/viewfile?f=CBC89A0D66C7B22374804C974FDFC907EF370F9D6EC9090C33587236FB1E23EA760B6E46F7A2B610B5988E9FDCE9EB81B6674E8EAC666B8577607D802586BD81423B0B14A6588A2567925300D680382641FCBAC2BCFA752EB4DB01BB52468F15&mailid=ZL3410-oIyeOGpFWXZ%7EUglWBMuRTa7&sid=7MBfpPZ7Qm1zazBv&net=58682980");
			String strHtml="<div class=\"WordSection1\">\r\n" + 
					"			<div style=\"height: 330px;\">\r\n" + 
					"				<p>你好：</p>\r\n" + 
					"				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我好难呀！</p>\r\n" + 
					"			</div>\r\n" + 
					"			<div align=\"right\">\r\n" + 
					"				<p class=\"MsoNormal\" style=\"text-align:right\"><b><span style=\"font-size:13.5pt;font-family:黑体;color:gray\">会员管理系统</span></b><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><b><span style=\"font-size:13.5pt;font-family:黑体;color:gray\">民航ABU运营交付部</span></b><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><b><span style=\"font-size:13.5pt;font-family:黑体;color:gray\">中央大客户事业本部</span></b><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:&quot;微软雅黑&quot;,sans-serif;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><b><span style=\"font-size:13.5pt;font-family:黑体;color:gray\">用友网络科技股份有限公司</span></b><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><span style=\"font-size:10.0pt;font-family:黑体;color:gray\">地址：<span onmouseover=\"QMReadMail.showLocationTip(this)\" class=\"readmail_locationTip\" onmouseout=\"QMReadMail.hideLocationTip(this)\" over=\"0\" style=\"z-index: auto;\">北京市朝阳区金盏路民航清算中心纵十二路</span><span lang=\"EN-US\">8</span>号楼<span lang=\"EN-US\">B</span>座<span lang=\"EN-US\">2</span>层</span><span lang=\"EN-US\" style=\"font-size:10.0pt;font-family:&quot;Calibri&quot;,sans-serif;color:gray\">&nbsp;</span><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><span style=\"font-size:10.0pt;font-family:黑体;color:gray\">邮箱：</span><u><span lang=\"EN-US\" style=\"font-size:10.0pt;font-family:黑体;color:blue\"><a href=\"mailto:zhangyu18@yonyou.com\" rel=\"noopener\" target=\"_blank\"><span style=\"color:#0563C1\">zhangyu18@yonyou.com</span></a></span></u><span lang=\"EN-US\" style=\"font-size:10.0pt;font-family:&quot;Calibri&quot;,sans-serif;color:gray\">&nbsp;</span><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><span style=\"font-size:10.0pt;font-family:黑体;color:gray\">电话：<span lang=\"EN-US\"><span style=\"border-bottom:1px dashed #ccc;z-index:1\" t=\"7\" onclick=\"return false;\" data=\"010-86482538\">010-86482538</span> </span>\r\n" + 
					"					</span><span lang=\"EN-US\" style=\"font-size:10.0pt;font-family:&quot;Calibri&quot;,sans-serif;color:gray\">&nbsp;</span><span lang=\"EN-US\" style=\"font-size:10.0pt;font-family:黑体;color:gray\"> <span style=\"border-bottom: 1px dashed rgb(204, 204, 204); z-index: 1; position: static;\" t=\"7\" onclick=\"return false;\" data=\"15540061217\" isout=\"1\">15540061217</span></span><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt;\"><span style=\"font-size:10.0pt;font-family:黑体;color:gray\">网址：<span lang=\"EN-US\"><a href=\"http://www.yonyou.com/\" rel=\"noopener\" target=\"_blank\"><span style=\"color:purple\">www.yonyou.com</span></a>\r\n" + 
					"					</span>\r\n" + 
					"					</span><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><o:p>&nbsp;</o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" style=\"line-height:15.75pt\"><span lang=\"EN-US\" style=\"font-size:13.5pt;font-family:宋体;color:black\"><img border=\"0\" width=\"349\" height=\"50\" style=\"width:3.6333in;height:.6333in;float: right ;\" id=\"_x0000_i1025\" src=\"/cgi-bin/viewfile?f=CBC89A0D66C7B22374804C974FDFC907EF370F9D6EC9090C33587236FB1E23EA760B6E46F7A2B610B5988E9FDCE9EB81B6674E8EAC666B8577607D802586BD81423B0B14A6588A2567925300D680382641FCBAC2BCFA752EB4DB01BB52468F15&mailid=ZL3410-oIyeOGpFWXZ%7EUglWBMuRTa7&sid=7MBfpPZ7Qm1zazBv&net=58682980\"><o:p></o:p></span></p>\r\n" + 
					"				<p class=\"MsoNormal\" align=\"left\" style=\"text-align:left\"><span lang=\"EN-US\" style=\"font-size:12.0pt;font-family:宋体\"><o:p>&nbsp;</o:p></span></p>\r\n" + 
					"			</div>\r\n" + 
					"		</div>";
			 //html代码
		    htmlPart.setContent(strHtml,"text/html;charset=utf-8");
		
		    //生成文件邮件
		    msg.saveChanges();
		    File file = new File("C:/myChattingRecords/QqEmail/demo.eml");
		    if(!file.exists()){
			    //先得到文件的上级目录,并创建上级目录,在创建文件
				if(!file.getParentFile().mkdir()) {
					file.getParentFile().getParentFile().mkdir();
				}
			    try {
			        //创建文件
			        file.createNewFile();
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}
		    //输出
		    OutputStream os = new FileOutputStream(file);
		    msg.writeTo(os);
		    os.close();
		    return true;
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return false;
		}
	/**
	 * 发送复杂邮件
	 * @param args
	 * @throws FileNotFoundException
	 * @throws MessagingException
	 */
	public static boolean sendComplexEmail(String receiver) {
		try {
		    // 属性对象
		    Properties properties = new Properties();
		    // 开启debug调试 ，打印信息
		    properties.setProperty("mail.debug", "true");
		    // 发送服务器需要身份验证
		    properties.setProperty("mail.smtp.auth", "true");
		    // 发送服务器端口，可以不设置，默认是25
		    properties.setProperty("mail.smtp.port", "25");
		    // 发送邮件协议名称
		    properties.setProperty("mail.transport.protocol", "smtp");
		    // 设置邮件服务器主机名
		    properties.setProperty("mail.host", "smtp.qq.com");
		    // 环境信息
		    Session session = Session.getInstance(properties, new Authenticator() {
		        @Override
		        protected PasswordAuthentication getPasswordAuthentication() {
		            // 在session中设置账户信息，Transport发送邮件时会使用
		            return new PasswordAuthentication("hlbrc.diplomaproject@foxmail.com","uhygapoqnfmydjjd");
		        }
		    });
		
		    //读取本地邮件
		    Message message = new MimeMessage(session, new FileInputStream(new File("C:/myChattingRecords/QqEmail/demo.eml")));
//		    message.addHeader("X-Mailer","Microsoft Outlook Express 6.00.2900.2869");
		    //发送邮件
		    Transport.send(message, InternetAddress.parse(receiver));
		    return true;
	    } catch(SendFailedException e) {
	    	System.err.println(e.getMessage()+":请检查收件人地址是否正确！");
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return false;
	}
	/**
	 *  测试qq邮箱发送
	 * @param zch
	 */
	public static void main(String[] args) {
		String testPople = "1529827884@qq.com";
//	    boolean b = sendEmail(testPople);
//	    System.out.println("发送"+(b?"成功":"失败"));

		boolean A = setCon(testPople);
		System.out.println(new Date());
		System.err.println(A?"Email创建成功":"Email创建失败");
		if(A) {
			A = sendComplexEmail(testPople);
			System.err.println("发送"+(A?"Email成功":"Email失败"));
		}
		else {
			System.err.println("发送Email失败");
		}
	}
}
