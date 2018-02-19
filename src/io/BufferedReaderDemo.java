/**
 * 利用BufferedReader实现数据的键盘输入
 */
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入信息：");
		// 默认的换行模式是BufferedReader最大缺点，如果不是因为此缺点，该类还会继续使用
		String str = buf.readLine(); // 接收输入信息，默认使用回车换行
		System.out.println("[ECHO]输入信息为：" + str);
		
		System.out.println("请输入年龄：");
		String age = buf.readLine();
		if(age.matches("\\d{1,3}")) {
			System.out.println("[ECHO]年龄为：" + Integer.parseInt(age));
		} else {
			System.out.println("输入的数据有错误！");
		}
		buf.close();
	}

}
