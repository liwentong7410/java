/**
 * 
 */
package com.practice;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Title:ClientSocket.java
 * @Package:com.practice
 * @Description:TODO
 *
 *
 * @author liwentong
 * @date 2017年11月27日下午8:06:41
 * @version 1.0
 */
public class ClientSocket {

	public void a(){
		
	}
	public void b(){
		a();
	}
	
	
	
	
	
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param @param args    
	 * @return void    
	 * @throws
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		try {
			Socket s = new Socket();
			s.connect(new InetSocketAddress("127.0.0.1", 60001));
			System.out.println("连接到服务器成功！");
			OutputStream os = s.getOutputStream();
			Scanner sc = new Scanner(System.in);
			String str=sc.nextLine();
			byte[] b=new byte[1024];
			b = str.getBytes();
			os.write(b);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
