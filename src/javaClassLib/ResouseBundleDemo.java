/**
 * 国际化程序的实现
 */
package javaClassLib;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResouseBundleDemo {

	public static void main(String[] args) {
//		Locale loc = new Locale("zh", "CN");
//		Locale loc = new Locale("en", "US");
		Locale loc = Locale.getDefault();
		// 这个时候设置的baesName没有后缀，而且一定要在CLASSPATH之中
		ResourceBundle res = ResourceBundle.getBundle("properties.Message", loc);
		String content = res.getString("welcome.info");
		System.out.println(MessageFormat.format(content, "Java", "Python", "Go"));
	}

}
