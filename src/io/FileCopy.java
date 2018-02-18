/**
 * 文件拷贝
 */
package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 建立一个专门负责文件拷贝处理的类，该类具备如下功能：
 * 1.需要判断拷贝的源文件是否存在
 * 2.需要判断目标文件的父路径是否存在，如果不存在则应该创建
 * 3.需要进行文件拷贝操作的处理
 * @author Administrator
 *
 */
class CopyUtil {  // 这个类不需要保存任何的属性，所以建议将构造方法私有化，使用static方法
	private CopyUtil() {}  // 将构造方法私有化
	
	/**
	 * 判断要拷贝的源路径是否存在
	 * @param path 输入的源路径信息
	 * @return 如果该路径真是存在返回true，否则返回false
	 */
	public static boolean fileExists(String path) { 
		return new File(path).exists(); 
	}
	
	/**
	 * 根据传入的路径来判断其父路径是否存在，如果不存在则创建
	 * @param path 要操作的文件路径，通过此路径取得父路径
	 */
	public static void createParentDirectory(String path) {
		File file = new File(path);
		if(!file.getParentFile().exists()) {  // 路径不存在
			file.getParentFile().mkdirs();  // 创建目录
		}
	}
	
	/**
	 * 实现文件拷贝的操作处理
	 * @param srcPath 源文件路径
	 * @param desPath 目标文件路径
	 * @return 拷贝完成返回true，否则返回false
	 */
	public static boolean copy(String srcPath, String desPath) {
		boolean flag = false;  // 文件拷贝的一个标记
		File inFile = new File(srcPath);
		File outFile = new File(desPath);
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(inFile);
			output = new FileOutputStream(outFile);
			copyHandle(input, output);  // 完成具体的文件拷贝处理
			flag = true;
		} catch (IOException e) {
			flag = false;
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	/**
	 * 实现具体的文件拷贝操作
	 * @param input 输入流对象
	 * @param output 输出流对象
	 */
	private static void copyHandle(InputStream input, OutputStream output) throws IOException {
		long start = System.currentTimeMillis();
		// InputStream 有一个读取单个字节的方法：int read()
		// OutputStream 有一个输出单个字节的方法：void write(int data)
		int temp = 0;
		byte[] data = new byte[2048];
		
//		do {
//			temp = input.read();  // 读取单个字节数据
//			output.write(temp);  // 通过输出流输出
//		} while(temp != -1);
		
		// 1. temp = input.read(data)，表示将数据读取到字节数组之中，而后返回数据读取个数
		// 2. (temp = input.read(data)) != -1，这判断这个读取的个数（保存在temp）是否为-1，如果不是表示有内容
		while((temp = input.read(data)) != -1) {
			output.write(data, 0, temp);  // 输出已读取完的字节数组
		}
		
		long end = System.currentTimeMillis();
		System.out.println("[统计]拷贝文件所花费的时间：" + (end - start));
	}
}

public class FileCopy {

	public static void main(String[] args) {
		if(args.length != 2) {  // 现在的参数不是2个
			System.out.println("错误的执行方式，调用命令：java Copy 源文件路径  目标文件路径");
			System.exit(1);  // 系统退出
		}
		if(CopyUtil.fileExists(args[0])) {  // 必须判断要拷贝的源文件路径是否存在
			CopyUtil.createParentDirectory(args[1]);  // 创建目标的父目录
			System.out.println(CopyUtil.copy(args[0], args[1]) ? "文件拷贝成功！" : "文件拷贝失败！");
		}else {
			System.out.println("对不起，源文件不存在，无法完成拷贝操作！");
		}
	}

}
