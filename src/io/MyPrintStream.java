/**
 * 打印流设计思想
 */
package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class PrintUtil { // 自己编写一个类，希望提供更多的输出支持
	private OutputStream output; // 定义一个OutputStream

	public PrintUtil(OutputStream output) { // 由外部来决定输出的位置
		this.output = output;
	}

	public void print(String str) {
		try {
			this.output.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void println(String str) {
		this.print(str + "\r\n");
	}

	public void print(int data) {
		this.print(String.valueOf(data));
	}

	public void println(int data) {
		this.print(String.valueOf(data) + "\r\n");
	}

	public void print(double data) {
		this.print(String.valueOf(data));
	}

	public void println(double data) {
		this.print(String.valueOf(data) + "\r\n");
	}
	
	public void close() {
		try {
			this.output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class MyPrintStream {

	public static void main(String[] args) throws IOException {
		PrintUtil pu = new PrintUtil(new FileOutputStream(new File("E:" + File.separator + "workspace" + File.separator
				+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "info.txt"), true));
		pu.print("姓名：");
		pu.println("Java");
		pu.println(1 + 10);
		pu.println(1.2 + 10.3);
		pu.close();
	}

}
