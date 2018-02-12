/**
 * Arrays类
 */
package javaClassLib;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] dataA = new int[] {1, 2, 3, 4, 5};
		int[] dataB = new int[] {2, 1, 3, 4, 5};
		System.out.println(Arrays.toString(dataA));
		System.out.println(Arrays.equals(dataA, dataB));
		System.out.println(Arrays.binarySearch(dataA, 4));
	}

}
