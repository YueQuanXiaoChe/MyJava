/**
 * 打印三角
 */
package algorithm;

public class PrintTriangle {

	public static void main(String[] args) {
		printTriangle(6);
	}

	public static void printTriangle(int n) {
		int line = n; // 打印n行
		for (int x = 1; x <= line; x++) { // 控制行
			for (int y = 1; y <= line - x; y++) { // 空格
				System.out.print(" ");
			}
			for (int z = 1; z <= x; z++) { // *
				System.out.print("* ");
			}
			System.out.println(); // 换行
		}
	}

}