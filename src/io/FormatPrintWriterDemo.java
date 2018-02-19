/**
 * 打印流: 格式文本化信息
 */
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FormatPrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		String name = "Java";
		int age = 20;
		double salary = -10000.145465135;
		PrintWriter pu = new PrintWriter(new FileOutputStream(new File("E:" + File.separator + "workspace" + File.separator
				+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "info.txt"), true));
		pu.printf("姓名：%s，年龄：%d，工资：%8.2f\r\n", name, age, salary);
		pu.close();
		
		String str = String.format("姓名：%s，年龄：%d，工资：%8.2f", name, age, salary);
		System.out.println(str);
	}

}
