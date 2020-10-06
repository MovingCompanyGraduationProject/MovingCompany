package com.hlbrc.movingcompany.util;

import com.hlbrc.movingcompany.util.Base64Util;
import com.hlbrc.movingcompany.util.FileUtil;
import com.hlbrc.movingcompany.util.HttpUtil;

import java.net.URLEncoder;

/**
* 身份证识别
*/
public class Idcard {

    /**
    * 重要提示代码中所需工具类
    * FileUtil,Base64Util,HttpUtil,GsonUtils请从
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * 下载
    */
	
	/**
	 * 识别身份证正反面
	 * @param idCardSide 正面 front 国徽面 back
	 * @param filePath 图片路径
	 * @return
	 */
    public static String idcard(String idCardSide,String filePath) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");
            //正面 front
            //国徽 back
            String param = "id_card_side=" + idCardSide + "&image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, param);
//            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}