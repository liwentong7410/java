/**
 * 
 */
package com.ketang.url;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Title:URLTest.java
 * @Package:com.ketang.url
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017年11月27日下午1:33:34
 * @version 1.0
 */
public class URLTest {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param @param args    
	 * @return void    
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws
	 * @param args
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的方法存根

		URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
		URLConnection oc = url.openConnection();
		HttpURLConnection huc=(HttpURLConnection)oc;
		huc.setRequestMethod("GET");
		huc.setConnectTimeout(5000);
		huc.setRequestProperty("Accept-Charset","UTF-8");
		//获取响应码
		if(200!=huc.getResponseCode()){
			return ;
		}
		int size=0;
		//请求道的资源的大小单位是字节
		System.out.println("Length:"+(size=huc.getContentLength()));
		
		InputStream is = huc.getInputStream();
		
		OutputStream os = new FileOutputStream("e:\\baidu.png");
		int length=0;
		double count=0;
		byte[] buffer=new byte[1027];
		while((length=is.read(buffer))!=-1){
			count+=length;
			System.out.println("已经读取："+((int)((count/size)*100))+"%");
			os.write(buffer,0,length);
			Thread.sleep(1000);
		}
		os.close();
		is.close();
		
	}

}
