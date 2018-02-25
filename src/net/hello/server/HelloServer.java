/**
 * 基本网络编程模型：服务端
 */
package net.hello.server;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws Exception {
		// 1.创建一个服务器端的服务对象，所有的服务一定要有一个监听端口
		ServerSocket server = new ServerSocket(9999); // 此时的服务在9999端口上等待连接
		System.out.println("等待客户来连接......");
		// 2.需要等待客户连接，也就是说此时的程序在此处会进入到一个阻塞状态
		Socket client = server.accept(); // 表示等待连接，连接的都是客户
		PrintWriter out = new PrintWriter(client.getOutputStream()) ;
		out.println("Hello world!"); // 要有换行
		out.close();
		server.close();
	}

}
