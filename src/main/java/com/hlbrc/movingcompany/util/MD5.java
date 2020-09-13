package com.hlbrc.movingcompany.util;  
  
import java.math.BigInteger;  
import java.security.MessageDigest;  

//import com.sun.org.apache.xml.internal.security.utils.Base64;
/**
 * MD5加密 解密
 * @author DELL
 *
 */
public class MD5 {  
    
	/*MD5,是一种信息摘要算法。简单来说，就是把一段信息（明文），通过一种有损的方式压缩成定长的字符（32位密文）。
	 * 因为这种压缩方式是会损失信息的，所以是无法还原出“明文”的。
	 * 虽然无法从数学上破解MD5算法，但由于现在计算机具备强大的计算能力，还是可以通过“穷举法”破解该算法。
	 * 如果想用该算法加密，还可以通过“加盐”的方式提高解密难度。
	 * 该算法允许多传一个参数"salt",指定通过MD5加密的次数，这样是能够提高解密难度的。
	*/
	
   /** 
   * 对字符串md5加密(小写+字母) 
   * 
   * @param str 传入要加密的字符串 
   * @return  MD5加密后的字符串 
   */  
  public static String getMD5(String str) {  
      try {  
          // 生成一个MD5加密计算摘要  
          MessageDigest md = MessageDigest.getInstance("MD5");  
          // 计算md5函数  
          md.update(str.getBytes());  
          // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符  
          // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值  
          return new BigInteger(1, md.digest()).toString(16);  
      } catch (Exception e) {  
         e.printStackTrace();  
         return null;  
      }  
  }  
    
    
  /** 
   * 对字符串md5加密(大写+数字) 
   * 
   * @param str 传入要加密的字符串 
   * @return  MD5加密后的字符串 
   */  
    
  public String getMD5s(String s) {  
      char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};         

      try {
      	//将获取密码s转换为字节类型的数组
          byte[] btInput = s.getBytes();  
          // 获得MD5摘要算法的 MessageDigest 对象  
          MessageDigest mdInst = MessageDigest.getInstance("MD5");  
          // 使用指定的字节更新摘要  
          mdInst.update(btInput);  
          // 获得密文  
          byte[] md = mdInst.digest();  
          // 把密文转换成十六进制的字符串形式  
          int j = md.length;  
          char str[] = new char[j * 2];  
          int k = 0;  
          for (int i = 0; i < j; i++) {  
              byte byte0 = md[i];  
              str[k++] = hexDigits[byte0 >>> 4 & 0xf];  
              str[k++] = hexDigits[byte0 & 0xf];  
          }  
          return new String(str);  
      } catch (Exception e) {  
          e.printStackTrace();  
          return null;  
      }  
  }  
  

      public static void main(String[] args) {  
      //String md5 = MD5("123456");  
      String md52 = getMD5("123456"); 
      //System.out.println(md5);
      System.out.println(md52);
  }
}  