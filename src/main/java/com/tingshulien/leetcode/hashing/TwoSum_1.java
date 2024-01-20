package com.tingshulien.leetcode.hashing;

import com.tingshulien.leetcode.utils.Top;
import com.tingshulien.leetcode.utils.topic.Array;
import com.tingshulien.leetcode.utils.topic.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
@Array
@HashTable
@Top
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }

        int [] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(target - nums[i]) || hash.get(target - nums[i]) == i) {
                continue;
            }

            answer[0] = i;
            answer[1] = hash.get(target - nums[i]);
            return answer;
        }

        return answer;
    }

}
