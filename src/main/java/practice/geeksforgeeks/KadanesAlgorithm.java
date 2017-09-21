package main.java.javaProgrammingClass.amazonPractice;

/*Kadane's Algorithm

Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array. The second line contains N
space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 100
-100 ≤ A[i] <= 100

Example:
Input
2
3
1 2 3
4
-1 -2 -3 -4
Output
6
-1

**For More Examples Use Expected Output***/
import java.util.*;
import java.lang.*;
import java.io.*;

public class KadanesAlgorithm {
    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);
        int numInputs = sysIn.nextInt();

        for(int i=0; i<numInputs; i++){

            int k = 0;
            int arrayLength = sysIn.nextInt();

            int maxVal = sysIn.nextInt();
            int rollingSum = Math.max(maxVal,0);

            for(int j=1; j<arrayLength; j++){
                rollingSum = Math.max(0, rollingSum+sysIn.nextInt());
                if(maxVal<rollingSum && rollingSum!=0){
                    maxVal = rollingSum;
                }
            }
            System.out.println(maxVal);

        }
    }
}