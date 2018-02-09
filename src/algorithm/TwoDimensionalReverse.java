/**
 * 数组案例:二维数组转置
 * 前提:行列相等
 */
package algorithm;

public class TwoDimensionalReverse {

	public static void main(String[] args) {
		int[][] data = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		reverse(data);
		printArray(data);
	}

	public static void reverse(int[][] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = x; y < arr[x].length; y++) {
				if (x != y) { // 交换
					int temp = arr[x][y];
					arr[x][y] = arr[y][x];
					arr[y][x] = temp;
				}
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y] + " ");
			}
			System.out.println();
		}
	}

}