package com.core.javaproblem;

public class ReverseVowelsOfGivenString {

        public String reverseVowels(String s) {
            char[] chars = s.toCharArray();
            int start = 0;
            int end = s.length() - 1;
            String vowels = "aeiouAEIOU";

            while (start < end) {
                // Find the first vowel from the start.
                while (start < end && vowels.indexOf(chars[start]) == -1) {
                    start++;
                }

                // Find the first vowel from the end.
                while (start < end && vowels.indexOf(chars[end]) == -1) {
                    end--;
                }

                // Swap the vowels.
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                // Move the pointers.
                start++;
                end--;
            }

            return new String(chars);
        }

    public static void main(String[] args) {

            String s= "hello"; // expected "holle"
            String s1 = "leetcode";  // expected "leotcede"

        ReverseVowelsOfGivenString revVowels = new ReverseVowelsOfGivenString();

        System.out.println("Hello :- " +revVowels.reverseVowels(s));
        System.out.println("leetcode :- " +revVowels.reverseVowels(s1));
        //revVowels.reverseVowels(s);
       // revVowels.reverseVowels(s1);




    }

}
