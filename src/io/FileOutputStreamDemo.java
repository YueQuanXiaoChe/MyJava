/**
 * 实现文件内容输出
 */
package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 1.通过File类定义文件路径
		if(!file.getParentFile().exists()) {  // 必须保证父目录存在
			file.getParentFile().mkdirs();
		}
		// 2.OutputStream是一个抽象类，所以需要通过子类进行实例化，意味着只能够进行文件处理
		OutputStream output = new FileOutputStream(file, true);
		// 3.进行文件的输出处理操作
		String msg = "Hello world!\r\n";  // 要求输出的内容
		output.write(msg.getBytes(), 1, 3);  // 将内容变成字节数组
		// 4.关闭输出
		output.close();
	}

}
