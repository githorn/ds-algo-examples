package com.githorn.algo.sorting;

import java.util.Arrays;

/**
 * Selection Sort
 * 
 * @author Sudhir Kumar
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 33, 12, 78, 56, 41, 9, 40 };

		System.out.println("Before sorting:\n" + Arrays.toString(nums));
		sort(nums);
		System.out.println("After sorting:\n" + Arrays.toString(nums));
	}

	private static void sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = i;
			int minValue = nums[minIndex];
			boolean swapRequired = false;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < minValue) {
					minValue = nums[j];
					minIndex = j;
					swapRequired = true;
				}
			}
			if (swapRequired) {
				int temp = nums[minIndex];
				nums[minIndex] = nums[i];
				nums[i] = temp;
			}
		}
	}

}
