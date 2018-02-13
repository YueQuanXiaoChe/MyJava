/**
 * Base64加密处理
 */
package javaClassLib;

import java.util.Base64;

public class Base64Demo {

	public static void main(String[] args) {
		String msg = "Hello world!";  // 原始数据
		String eMsg = Base64.getEncoder().encodeToString(msg.getBytes());  // 加密处理		
		System.out.println("加密后的数据: " + eMsg);
		byte[] data = Base64.getDecoder().decode(eMsg);
		System.out.println("解密后的数据: " + new String(data));
		
		String eeeMsg = encode(encode(encode(msg)));
		System.out.println("加密后的数据: " + eeeMsg);
		
		String seed = encode("YueQuanXiaoChe");  // 秘钥
		msg += "(" + seed + ")";
		String seedMsg = encode(encode(encode(msg)));
		System.out.println("加密后的数据: " + seedMsg);
	}

	public static String encode(String msg) {
		return Base64.getEncoder().encodeToString(msg.getBytes());
	}
}
