/**
 * UUID类: 根据当前的地址还有时间戳自动生成一个几乎不会重复的字符串
 */
package javaClassLib;

import java.util.UUID;

public class UUIDDemo {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();  // 根据当前的地址和时间戳取得一个内容
		System.out.println(uuid);
	}

}
