/**
 * StringBuffer类
 */
package javaClassLib;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();  // 建立一个StringBuffer类的对象
		sb.append("Hello ").append("world!");
		fun(sb);  // 修改了sb的内容
		System.out.println(sb);
		
		CharSequence seq = "Hello";  // 字符串，子类对象为父接口实例化
		
		String str = "Hello";
		StringBuffer buf = new StringBuffer(str);
		System.out.println(buf);
		System.out.println(buf.toString());
		
		System.out.println(buf.reverse());
		System.out.println(buf.delete(1, 3));
		System.out.println(buf.insert(1, "你好"));
		
	}
	
    public static void fun(StringBuffer temp) {
    	temp.append("\n").append("YueQuanXiaoChe");
    }
}
