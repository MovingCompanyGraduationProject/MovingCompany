package com.hlbrc.movingcompany.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 操作多种方式读写文件的类
 * @author DELL
 *
 */
public class ChattingRecordsIO {
	/**
	 * 以字节为单位写入文件
	 * @param filePath 文件路径
	 * @param content 内容
	 * @throws IOException
	 */
	public static void writeFileByBytes(String filePath,String content) throws IOException {
		OutputStream out =null;//字节输出流
		File file = null;
		try {
			file = new File(filePath);
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
			out=new FileOutputStream(file,true);  //打开文件输出流
			content = content+"\n";
			byte[] bytes= content.getBytes();  //读取输出流中的字节
			out.write(bytes);     //写入文件
			out.flush();
			System.out.println("写文件："+file.getAbsolutePath()+"成功！");
		} catch(IOException e) {
			throw new IOException("写文件："+file.getAbsolutePath()+"失败！\n"+e.getMessage());
		} finally {      //内容总执行
			if(out!=null) {
				try {
					out.close();  //关闭此输出流并释放与此流相关联的任何系统资源。 
				}catch(IOException el) {
				}
			}
		}
	}
	
	/**
	 * 读取txt文件
	 * @param filePath 文件路径
	 * @return
	 * @throws IOException 
	 */
	public static String readFile(String filePath) throws IOException {
		String context = "";
		 try {
		    	//读取txt文件
		        BufferedReader bf = new BufferedReader(new FileReader(filePath));
		        String line = "";
		        while((line = bf.readLine()) != null){
		        	context+=line;
		        }
		        bf.close();
		    } catch (IOException e) {
		    	throw new IOException("读取文件："+filePath+"失败！\n"+e.getMessage());
		    }
		return context;
	}
	
	/**
	 * 清除文件内容
	 * @param filePath 文件路径
	 */
	public static void clearFile(String filePath){
		FileWriter fileWriter = null;
		try {
			File file =new File(filePath);
			if(file.exists()){
				fileWriter =new FileWriter(file);
	            fileWriter.write("");
	            fileWriter.flush();
			}
			else {
				throw new IOException("清除文件失败！未找到文件："+file.getAbsolutePath()+",请检查文件路径是否正确！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {      //内容总执行
			if(fileWriter!=null) {
				try {
		            fileWriter.close();  //关闭此输出流并释放与此流相关联的任何系统资源。 
				}catch(IOException el) {
				}
			}
		}
	}

}
