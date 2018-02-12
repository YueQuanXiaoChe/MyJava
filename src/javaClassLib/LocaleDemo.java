/**
 * 国际化: Locale类
 */
package javaClassLib;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		System.out.println(Locale.CHINA);  // zh_CN
		System.out.println(Locale.CHINESE);  // zh
		System.out.println(Locale.US);  // en_US
		
		System.out.println(Locale.getDefault());
	}

}
