/**
 * 实现文件信息的读取
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 1.通过File类定义文件路径
		if(file.exists()) {  // 必须保证文件存在才可以进行读取处理
			InputStream input = new FileInputStream(file);
			byte[] data = new byte[1024];  // 每次可以读取的最大数量
			int len = input.read(data);  // 此时数据读取到了数组之中
			System.out.println("读取的内容: [" + (new String(data, 0, len)) + "]");
			input.close();
		}
	}

}
