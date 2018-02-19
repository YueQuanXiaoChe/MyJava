/**
 * 使用系统打印流: 装饰器设计模式
 */
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pu = new PrintWriter(new FileOutputStream(new File("E:" + File.separator + "workspace" + File.separator
				+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "info.txt"), true));
		pu.print("姓名：");
		pu.println("Java");
		pu.println(1 + 10);
		pu.println(1.2 + 10.3);
		pu.close();
	}

}
