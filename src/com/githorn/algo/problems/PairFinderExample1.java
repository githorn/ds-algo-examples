package com.githorn.algo.problems;

import java.util.Arrays;

/**
 * <b>Problem:</b> Given an unsorted integer array, find a pair with the given
 * sum in it.<br>
 * <br>
 * 
 * Input:<br>
 * nums = [8, 7, 2, 5, 3, 1]<br>
 * target = 10<br>
 * <br>
 * 
 * Output:<br>
 * Pair found (8, 2)<br>
 * or<br>
 * Pair found (7, 3)<br>
 * <br>
 * 
 * Input:<br>
 * nums = [5, 2, 6, 8, 1, 9]<br>
 * target = 12<br>
 * <br>
 * 
 * Output: Pair not found
 * 
 */

public class PairFinderExample1 {

	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		System.out.println("Array: " + Arrays.toString(nums));
		findPair(nums, target); // when array is unsorted; time complexity O(n*n) with no extra space
	}

	private static void findPair(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("Pair found (" + nums[i] + ", " + nums[j] + ")");
					return;
				}
			}
		}
		System.out.println("Pair not found");
	}

}
