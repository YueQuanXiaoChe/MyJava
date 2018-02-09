/**
 * 数组案例:数组转置
 */
package algorithm;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		reverse(data);
		printArray(data);
	}

	public static void reverse(int[] arr) {
		int center = arr.length / 2; // 转换次数
		int head = 0; // 头部开始索引
		int tail = arr.length - 1; // 尾部开始索引
		for (int i = 0; i < center; i++) {
			int temp = arr[head];
			arr[head] = arr[tail];
			arr[tail] = temp;
			head++;
			tail--;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}