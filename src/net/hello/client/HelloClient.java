/**
 * 基本网络编程模型：客户端
 */
package net.hello.client;

import java.net.Socket;
import java.util.Scanner;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		// 1.表示连接到指定的服务器端的主机名称和端口，localhost = 127.0.0.1
		Socket client = new Socket("localhost", 60004);
		// 2.等待进行服务器端的输出，服务器端输出对客户端是输入
		Scanner scan = new Scanner(client.getInputStream());
		scan.useDelimiter("\n");
		if(scan.hasNext()) {
			System.out.println(scan.next().trim()); // 注意要去掉空格
		}
		client.close();
	}

}
