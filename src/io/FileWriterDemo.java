/**
 * 字符输出流: Writer
 */
package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 1.通过File类定义文件路径
		if(!file.getParentFile().exists()) {  // 必须保证父目录存在
			file.getParentFile().mkdirs();
		}
		String msg = "世界和平!";
		Writer out = new FileWriter(file);
		out.write(msg, 1, 3);
		out.append(msg);
//		out.flush();  // 写上此语句表示强制清空缓冲内容，所有内容都输出，out.close()会自动清空缓冲内容
		out.close();
	}

}
