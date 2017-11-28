/**
 * 
 */
package com.ketang.url;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/**
 * 
 * @Title:Client.java
 * @Package:com.ketang.url
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017年11月27日下午4:26:52
 * @version 1.0
 */
public class Client {

	public static InputStream is = null;
	public static OutputStream os = null;
	public static Scanner sc=null;
	public static Socket s=null;
	
	public static void main(String[] args) {
		
		try {
			Client.s=new Socket("192.168.3.40", 998);
			System.out.println("客户端绑定服务端成功");
			Client.is=s.getInputStream();
			Client.os=s.getOutputStream();
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
			
			
			while (true) {
				// --客户端通过输出流向服务端写信息.
				byte[] buffer = null;
				System.out.println(new String(buffer));
				if (new String(buffer).substring(0,6).equals("exit..")) {
					break;
				}
			}
				
		
		
			String str = null;
			while(true){
				sc = new Scanner(System.in);
				System.out.print("请输入:");
				str = sc.next();
				try {
					os.write(str.getBytes());
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				if (str.substring(0,6).equals("exit..")) {
					break;
				}
			}
	}
}

// exit..