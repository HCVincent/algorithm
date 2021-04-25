package day08;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = { 101, 34, 119, 1 };
		insertSort(arr);
	}

	public static void insertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int insertValue = arr[i];
			int insertIndex = i - 1;
			while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex + 1] = insertValue;
			System.out.println("µÚ"+i+"ÂÖ²åÈë");
			System.out.println(Arrays.toString(arr));
		}
	}

}
