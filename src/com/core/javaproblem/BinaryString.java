package com.core.javaproblem;

import java.util.Arrays;
public class BinaryString {
    //generate all the strings of n bits. assume a 0..n – 1 is an array of size n
    int[] A;
    public BinaryString(int n){
        A= new int[n];
    }
    public void binary(int n){

        if (n <= 0){
            System.out.println(Arrays.toString(A));
        } else {
            A[n-1] =0;  // 0 th path
            binary(n-1);
            A[n-1] =1; // 1 th path
            binary(n-1);
        }
    }

    public static void main(String[] args) {
        int n= 4;
        BinaryString binaryString = new BinaryString(n);
        binaryString.binary(n);
    }
}
