/**
 * 
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数据：");
		if (scan.hasNext()) { // 有输入内容,不判断空字符串
			System.out.println("[ECHO]输入内容为：" + scan.next());
		}

		System.out.println("请输入年龄：");
		if (scan.hasNextInt()) { // 有输入内容,不判断空字符串
			System.out.println("[ECHO]年龄为：" + scan.nextInt());
		} else {
			System.out.println("ERROR：输入的不是数字！");
		}

		System.out.println("请输入生日：");
		if (scan.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			System.out.println("[ECHO]生日为：" + scan.next());
		} else {
			System.out.println("ERROR：输入的不是生日！");
		}
		scan.close();

		Scanner newScan = new Scanner(new FileInputStream(new File("E:" + File.separator + "workspace" + File.separator
				+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "info.txt")));
		newScan.useDelimiter("\r\n");
		while(newScan.hasNext()) {
			System.out.println(newScan.next());
		}
		newScan.close();
	}

}
