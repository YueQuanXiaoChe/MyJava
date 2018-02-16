/**
 * File类综合操作: 列出子目录内容
 */
package io;

import java.io.File;

public class FileIntegratedOperation {

	public static void main(String[] args) {
		// 以下代码会产生线程阻塞问题，因此创建一个新的线程执行其他代码
		new Thread(()->{
			File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava");  // 要操作的文件
			listDir(file);			
		}, "列出线程").start();
		System.out.println("开始进行文件的信息列出......");
	}

	/**
	 * 列出制定目录中的全部子目录信息
	 * @param file
	 */
	public static void listDir(File file) {
		if(file.isDirectory()) {  // 如果file是一个目录
			File[] result = file.listFiles();
			if(result != null) {
				for (File f : result) {  // 继续列出该子目录中的内容
					listDir(f);  // 继续列出
				}
			}
		}
		System.out.println(file);  // 直接输出
	}
}
