package com.core.javaproblem;

import java.util.Arrays;

public class GenerateBinaryString {

    //generate all the strings of n bits. assume a 0..n – 1 is an array of size n

    public void printBinaryCombination(int index, int[] arr) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[index] = 0;
        printBinaryCombination(index + 1, arr);
        arr[index] = 1;
        printBinaryCombination(index + 1, arr);
    }

    public static void main(String[] args) {
        GenerateBinaryString obj = new GenerateBinaryString();
        int length = 3;

        System.out.println("Approach");
        obj.printBinaryCombination(0, new int[length]);
    }
}
