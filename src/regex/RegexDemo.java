/**
 * 正则表达式
 */
package regex;

import java.text.SimpleDateFormat;

public class RegexDemo {

	public static void main(String[] args) throws Exception {
		// 字符串替换
		String str = "asndl;asdoa0-qmkoij and us81hjdai";
		String regex = "[^a-zA-Z]";  // 正则
		System.out.println(str.replaceAll(regex, ""));  
		
		// 字符串拆分
		String str1 = "a1b22c333d444e55555g";
		String regex1 = "\\d+";  // 正则 [0-9]
		String[] result = str1.split(regex1);
		for (String s : result) {
			System.out.println(s);
		}
		
		// 验证某一个字符串是否是数字，如果是将其变为double类型
//		String str2 = "111002";
		String str2 = "111002.98";
		String regex2 = "\\d+(\\.\\d+)?";
		if(str2.matches(regex2)) {  // 匹配成功
			double data = Double.parseDouble(str2);
			System.out.println(data);
		}
		
		// 验证一个字符串是否是日期或日期时间，如果是将其变为Date类型
//		String str3 = "2018-02-15";
		String str3 = "2018-02-15 21:45:21";
		String regex3 = "\\d{4}-\\d{2}-\\d{2}";
		if(str3.matches(regex3)) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(str3));
		}else if(str3.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(str3));
		}
		
		// 验证电话号码是否正确
//		String str4 = "51283346";
//		String str4 = "01051283346";
		String str4 = "(010)-51283346";
		String regex4 = "((\\(\\d{3,4}\\)-)|(\\d{3,4}))?\\d{7,8}";
		System.out.println(str4.matches(regex4));

        // 验证字符串是否是email地址
		String str5 = "31275ni_you9057@qq.com";
		String regex5 = "\\w+@\\w+\\.\\w+";  // 简单验证，邮件地址由字母、数字、_所组成
		System.out.println(str5.matches(regex5));
		
		// 复杂验证，邮件地址必须由字母开头，可以是字母、数字、_、-、.所组成，
		// 而且用户名的长度必须在6~15位之间，域名的后缀必须是.com/.net/.cn/.org/.gov/.com.cn/.net.cn
		String str6 = "straw_8-java.ts@Python.cn";
		String regex6 = "[a-zA-Z][a-zA-Z\\-_\\.0-9]{5,14}@[a-zA-Z\\-_\\.0-9]+\\.(com|net|cn|org|gov|com\\.cn|net\\.cn)";
		System.out.println(str6.matches(regex6));
	}

}
