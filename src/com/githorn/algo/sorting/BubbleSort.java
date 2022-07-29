package com.githorn.algo.sorting;

import java.util.Arrays;

/**
 * Optimized Bubble Sort
 * 
 * @author Sudhir Kumar
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 33, 12, 78, 56, 41, 9, 40 };
		int numsLength = nums.length;
		boolean swapped = false;

		// bubble sort algorithm
		for (int i = 1; i < nums.length; i++) {
			swapped = false;
			for (int j = 0; j < numsLength - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
			numsLength--;
			System.out.println("After Pass " + i + ": " + Arrays.toString(nums));
			if (!swapped) // array is already sorted; no further iteration needed
				break;
		}
	}

}
