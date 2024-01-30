package com.core.javaproblem;

import java.util.Arrays;

public class K_ArrayString {

    // Generate All the string of length n drawn from 0....k -1
    int[] A;
    public K_ArrayString(int n){
        A= new int[n];
    }
    public void base_K_Strings(int n, int k){

        //process akk K-array strings of lenth n

        if (n <= 0){
            System.out.println(Arrays.toString(A));
        } else {

            for (int j = 0; j < k; j++){
                A[n -1] = j;
                base_K_Strings(n -1, k);
            }
        }
    }

    public static void main(String[] args) {
        int n= 4;
        K_ArrayString obj = new K_ArrayString(n);
        obj.base_K_Strings(n, 4);
    }
}
