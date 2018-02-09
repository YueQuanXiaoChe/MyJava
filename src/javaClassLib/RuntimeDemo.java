/**
 * Runtime类
 */
package javaClassLib;

public class RuntimeDemo {

	public static void main(String[] args) {
		String str = "";
		for (int x = 0; x < 3000; x++) {
			str += x;
		}
		Runtime run = Runtime.getRuntime();
		System.out.println("1.MAX = " + byteToM(run.maxMemory()));
		System.out.println("2.TOTAL = " + byteToM(run.totalMemory()));
		System.out.println("3.FREE = " + byteToM(run.freeMemory()));
		run.gc();
		System.out.println("1.MAX = " + byteToM(run.maxMemory()));
		System.out.println("2.TOTAL = " + byteToM(run.totalMemory()));
		System.out.println("3.FREE = " + byteToM(run.freeMemory()));
	}

	public static double byteToM(long num) {
		return (double) num / 1024 / 1024;
	}
}
