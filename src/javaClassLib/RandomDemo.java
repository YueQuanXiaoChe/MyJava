/**
 * 随机数
 */
package javaClassLib;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int x = 0; x < 10; x++) {
			System.out.println(rand.nextInt(100)); // 100表示最大值，数据范围是0 ~ 99
		}

		// 随机字符验证码
		char[] data = new char[] { 'a', 'b', 'c', 'd', 'e' };
		for (int y = 0; y < 3; y++) {
			System.out.print(data[rand.nextInt(data.length)] + " ");
		}
	}

}
