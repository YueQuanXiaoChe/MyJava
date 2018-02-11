/**
 * 日期格式化
 */
package javaClassLib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  // 定义转换类同时设置模板
		
		Date date = new Date();  // 当前的日期时间
		String result = sdf.format(date);  // 将日期进行格式化处理
		System.out.println(result);
		
		String str = "1911-11-11 11:11:11.111";
		Date temp = sdf.parse(str);
		System.out.println(temp);
	}

}
