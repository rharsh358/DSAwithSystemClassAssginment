package sunny.dsa;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/
class AnagramChecker {

    public boolean isAnagram(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        //  Alternative way to solve the problem Approach 1

        /*char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);*/

        // Approach 2 and optimised

        // Create a map to count characters
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrease count based on the second string
        for (char c : t.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        // Check if all counts are zero
        return charCountMap.isEmpty();
    }
}

public class Anagram {
    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();

        // Example usage:
        System.out.println(checker.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(checker.isAnagram("rat", "car"));         // Output: false
    }

}
