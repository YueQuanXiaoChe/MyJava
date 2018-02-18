/**
 * 内存操作流
 */
package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayStream {

	public static void main(String[] args) throws IOException {
		String msg = "Hello world!";
		// 实例化InputStream类对象，实例化的时候需要将你操作的数据保存到内存之中。你读取的就是你设置的内容
		InputStream input = new ByteArrayInputStream(msg.getBytes());
		OutputStream output = new ByteArrayOutputStream();
		int temp = 0;
		while((temp = input.read()) != -1) {
			output.write(Character.toUpperCase(temp));  // 每个字节数据进行处理
		}  // 此时所有的数据都在OutputStream类中了
		System.out.println(output);  // 直接输出对象，调用toString()
		input.close();
		output.close();
	}

}
