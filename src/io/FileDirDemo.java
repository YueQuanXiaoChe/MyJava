/**
 * 创建目录
 */
package io;

import java.io.File;
import java.io.IOException;

public class FileDirDemo {

	public static void main(String[] args) throws IOException {
		// 文件目录中有多级未创建的目录时的操作
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "io" + File.separator + "file" + File.separator + "hello.txt");  // 定义要操作的文件路径
		if(!file.getParentFile().exists()) {  // 父目录不存在
			file.getParentFile().mkdirs();
		}
		if(file.exists()) {
			file.delete();
		}else {
			file.createNewFile();
		}
	}

}
