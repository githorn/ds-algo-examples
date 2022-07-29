package com.githorn.algo.sorting;

import java.util.Arrays;

/**
 * Insertion Sort
 * 
 * @author Sudhir Kumar
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 33, 12, 78, 56, 41, 9, 40 };

		int key;
		int j;
		int pass = 0;
		for (int i = 1; i < nums.length; i++) {
			key = nums[i];
			j = i - 1;

			System.out.println("j = " + j);
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				nums[j] = key;
				j--;
			}
			System.out.println("pass " + (++pass) +": "+ Arrays.toString(nums));
		}
	}

}
