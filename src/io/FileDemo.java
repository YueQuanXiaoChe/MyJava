/**
 * File类的基本操作
 */
package io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// 由不同的操作系统的JVM来决定separator是什么分隔符
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "hello.txt");  // 定义要操作的文件路径
		if(file.exists()) {  // 文件存在
			file.delete();  // 删除文件
		}else {  // 文件不存在
			file.createNewFile();  // 创建新文件
		}
	}

}
