/**
 * 数组案例:二分查找(采用方法递归完成)
 * 前提:数组必须是个有序的数组
 */
package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int search = 10;
		System.out.println(binarySearch(data, 0, data.length - 1, search));
	}

	public static int binarySearch(int[] arr, int from, int to, int search) {
		if (from < to) {
			int mid = (from / 2) + (to / 2); // 确定中间点
			if (arr[mid] == search) { // 数据找到了
				return mid; // 取得当前索引
			} else if (search < arr[mid]) {
				return binarySearch(arr, from, mid - 1, search);
			} else if (search > arr[mid]) {
				return binarySearch(arr, mid + 1, to, search);
			}
		} else if (from == to && arr[from] == search) {
			return from;
		}
		return -1;
	}

}