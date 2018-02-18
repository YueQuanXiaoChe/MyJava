/**
 * 字符输入流: Reader
 */
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 1.通过File类定义文件路径
		if(file.exists()) {
			Reader in = new FileReader(file);
			char[] data = new char[1024];
			int len = in.read(data);
			System.out.println(new String(data, 0, len));
			in.close();
		}
	}

}
