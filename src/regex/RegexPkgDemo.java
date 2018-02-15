/**
 * Pattern类、Matcher类的使用
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPkgDemo {

	public static void main(String[] args) {
		// 字符串拆分
		String str = "a|b|c";
		String regex = "\\|";
		Pattern pat = Pattern.compile(regex);
		String[] result = pat.split(str);
		for (String s : result) {
			System.out.println(s);
		}
		
		// 匹配
		String str1 = "100";
		String regex1 = "\\d+";
		Pattern pat1 = Pattern.compile(regex1);
		Matcher mat1 = pat1.matcher(str1);
		System.out.println(mat1.matches());
		
		String str2 = "INSERT INTO member(mid,name,age) VALUES (#{member.mid},#{member.name},#{member.age})";
		String regex2 = "#\\{[a-zA-Z0-9_\\.]+\\}";
		Pattern pat2 = Pattern.compile(regex2);
		Matcher mat2 = pat2.matcher(str2);
		while(mat2.find()) {  // 依次进行比较，如果符合则取出内容
			System.out.println(mat2.group(0));
		}
	}

}
