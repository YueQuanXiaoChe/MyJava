/**
 * 数组案例:冒泡排序
 */
package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] data = new int[] { 7, 5, 9, 3, 0, 4, 6, 2, 1, 8 };
		sort(data);
		printArray(data);
	}

	public static void sort(int[] arr) { // 实现数组排序
		for (int x = 0; x < arr.length - 1; x++) { // 控制整体的循环次数
			for (int y = 0; y < arr.length - 1 - x; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}