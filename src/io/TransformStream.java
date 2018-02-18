/**
 * 转换流: OutputStreamWriter / InputStreamReader
 */
package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TransformStream {

	public static void main(String[] args) throws IOException {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 1.通过File类定义文件路径
		if(!file.getParentFile().exists()) {  // 必须保证父目录存在
			file.getParentFile().mkdirs();
		}
		
		OutputStream output = new FileOutputStream(file);
		Writer out = new OutputStreamWriter(output);  // 字节流变为字符流
		out.write("Hello world!");
		out.close();
	}

}
