package com.core.javaproblem;

public class TowerOfHanoi {

    //Tower of Hanoi problem
  public static void towerOfHanoi(int numberOfDisk, char fromRod,
                             char toRod, char auxRod)
    {
        if (numberOfDisk == 0) {
            return;
        }
        towerOfHanoi(numberOfDisk - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + numberOfDisk + " from rod "
                + fromRod + " to rod "
                + toRod);
        towerOfHanoi(numberOfDisk - 1, auxRod, toRod, fromRod);
    }

    // Driver code 
    public static void main(String args[])
    {
        int N = 3;

        // A, B and C are names of rods 
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}
