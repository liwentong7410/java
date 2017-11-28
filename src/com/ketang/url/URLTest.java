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
 * @date 2017��11��27������1:33:34
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
		// TODO �Զ����ɵķ������

		URL url = new URL("https://www.baidu.com/img/bd_logo1.png");
		URLConnection oc = url.openConnection();
		HttpURLConnection huc=(HttpURLConnection)oc;
		huc.setRequestMethod("GET");
		huc.setConnectTimeout(5000);
		huc.setRequestProperty("Accept-Charset","UTF-8");
		//��ȡ��Ӧ��
		if(200!=huc.getResponseCode()){
			return ;
		}
		int size=0;
		//���������Դ�Ĵ�С��λ���ֽ�
		System.out.println("Length:"+(size=huc.getContentLength()));
		
		InputStream is = huc.getInputStream();
		
		OutputStream os = new FileOutputStream("e:\\baidu.png");
		int length=0;
		double count=0;
		byte[] buffer=new byte[1027];
		while((length=is.read(buffer))!=-1){
			count+=length;
			System.out.println("�Ѿ���ȡ��"+((int)((count/size)*100))+"%");
			os.write(buffer,0,length);
			Thread.sleep(1000);
		}
		os.close();
		is.close();
		
	}

}
