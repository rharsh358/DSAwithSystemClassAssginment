package com.core.javaproblem;

public class GivernSortedArray {

    //given an array check whether the array is in sorted order with recursion

    public int isArraySortedOrder(int[] givenArray, int index){

        if (givenArray.length == 1 || index == 1)
            return 1;

        return (givenArray[index - 1] < givenArray[index -2]) ? 0 : isArraySortedOrder(givenArray, index -1);
    }

    public static void main(String[] args) {

        GivernSortedArray gsa = new GivernSortedArray();

        int [] a = { 1,2,18,4,8,8,22,50};
        System.out.println(gsa.isArraySortedOrder(a,1));
    }
}

