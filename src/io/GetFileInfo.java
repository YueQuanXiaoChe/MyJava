/**
 * 取得文件信息
 */
package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyMath {
	/**
	 * 进行数据的四舍五入操作
	 * @param num 表示原始的操作数据
	 * @param scale 表示保留的小数位数
	 * @return 已经正确四舍五入后的内容
	 */
	public static double round(double num, int scale) {
		return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
	}
}

public class GetFileInfo {

	public static void main(String[] args) {
		File file = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator + "head.jpg");  // 要操作的文件
		if(file.exists() && file.isFile()) {  // 必须保证文件存在才能取得相应的信息
			System.out.println("文件大小: " + MyMath.round(file.length()/(double)1024/1024, 2) + "M");
			System.out.println("最后一次修改日期: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
		}
		
		File file1 = new File("E:" + File.separator + "workspace" + File.separator + "MyJava" + File.separator + "src" + File.separator + "assets" + File.separator);
		if(file1.exists() && file1.isDirectory()) {
			File[] result = file1.listFiles();  // 列出目录中的全部内容
			for (File f : result) {
				System.out.println(f);
			}
		}
	}

}
