/**
 * System类对IO的支持
 */
package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemIO {

	public static void main(String[] args) throws IOException {
		// 系统输出
		OutputStream output = System.out;
		output.write("世界，和平！".getBytes());

		System.out.println();

		// 系统输入
		InputStream input = System.in; // 为父类实例化
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] data = new byte[10]; // 开辟一块空间
		System.out.print("请输入信息：");
		int temp = 0;
		while ((temp = input.read(data)) != -1) { // 数据读取到字节数组中
			// 这里面需要自己处理换行的问题，因为换行不属于文件结束，所以内容不是-1
			bos.write(data, 0, temp); // 保存在内存输出流
			byte[] tb = new byte[] { 
				data[temp - 2], 
				data[temp - 1] 
			};
			if (new String(tb).equals("\r\n")) {
				break;
			}
		}
		System.out.println("[ECHO]输入内容为：" + (new String(bos.toByteArray())));
	}

}
