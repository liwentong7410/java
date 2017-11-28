/**
 * 
 */
package com.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Title:ServerSorket.java
 * @Package:com.practice
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017年11月27日下午7:15:36
 * @version 1.0
 */
public class ServerSorket {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(60001);
			System.out.println("等待客户端连接。。。");
			//阻塞方法，侦听并接收到此套接字的连接，
			Socket s = ss.accept();
			System.out.println("客户端已连接");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			byte[] b=new byte[1024];
			is.read(b);
			System.out.println("接收到来自客户端的信息："+new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
