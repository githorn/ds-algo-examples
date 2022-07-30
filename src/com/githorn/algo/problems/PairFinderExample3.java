package com.githorn.algo.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

public class PairFinderExample3 {

	public static void main(String[] args) {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
		int target = 10;

		System.out.println("Array: " + Arrays.toString(nums));
		findPair(nums, target); // time complexity O(n) and requires O(n) extra space
	}

	private static void findPair(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				System.out.printf("Pair found (%d, %d)", (target - nums[i]), nums[i]);
				return;
			} else {
				map.put(nums[i], i);
			}
		}
		System.out.println("Pair not found");
	}

}
