package com.tingshulien.leetcode;

import com.tingshulien.leetcode.utils.Top;
import com.tingshulien.leetcode.utils.topic.HashTable;
import com.tingshulien.leetcode.utils.topic.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">3. Longest Substring Without Repeating Characters</a>
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 */
@SlidingWindow
@HashTable
@Top
public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> duplicate = new HashSet<>();
        char[] characters = s.toCharArray();
        int left = 0;
        int answer = 0;

        for (int right = 0; right < characters.length; right++) {
            while (duplicate.contains(characters[right])) {
                duplicate.remove(characters[left]);
                if (characters[left++] == characters[right]) {
                    break;
                }
            }

            duplicate.add(characters[right]);
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }

}
