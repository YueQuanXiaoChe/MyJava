/**
 * 日期处理类(Date类)
 */
package javaClassLib;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		long num = System.currentTimeMillis();  // 取得当前日期时间数字
		System.out.println(new Date(num));
		
		System.out.println(new Date().getTime());
	}

}
