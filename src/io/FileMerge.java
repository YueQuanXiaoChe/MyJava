/**
 * 文件合并处理
 */
package io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		File[] files = new File[] {
				new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src"
						+ File.separator + "assets" + File.separator + "data-a.txt"),
				new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src"
						+ File.separator + "assets" + File.separator + "data-b.txt") };
		// System.out.println(readFile(files[0]));
		// System.out.println(readFile(files[1]));
		String[] data = new String[files.length];
		for (int x = 0; x < files.length; x++) {
			data[x] = readFile(files[x]); // 读取数据
		}
		StringBuffer buf = new StringBuffer();
		String[] contentA = data[0].split(" ");
		String[] contentB = data[1].split(" ");
		OutputStream output = new FileOutputStream(new File("E:" + File.separator + "workspace" + File.separator
				+ "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "data-c.txt"));
		for (int y = 0; y < contentA.length; y++) {
			buf.append(contentA[y]).append("(").append(contentB[y]).append(")").append(" ");
		}
		output.write(buf.toString().getBytes());
		output.close();
		// System.out.println(buf);
	}

	/**
	 * 如果要读取文件的内容最好传递的是File类对象，因为这个对象一定会包含完整路径
	 * 
	 * @param file
	 * @return 返回文件的内容
	 * @throws IOException
	 */
	public static String readFile(File file) throws IOException {
		if (file.exists()) {
			InputStream input = new FileInputStream(file);
			// 这里没有向上转型，因为toByteArray()方法属于子类扩充的方法
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int temp = 0;
			byte[] data = new byte[10];
			while ((temp = input.read(data)) != -1) { // 内容都在内存流
				bos.write(data, 0, temp);
			}
			bos.close();
			input.close();
			return new String(bos.toByteArray()); // 将所有读取的内容返回
		}
		return null;
	}
}
