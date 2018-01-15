package sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] merge(int[] lArr, int[] rArr){
        int totalLength = lArr.length+rArr.length;
        int[] output = new int[totalLength];
        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex + rightIndex < totalLength){
            if(leftIndex < lArr.length && rightIndex < rArr.length){
                if(lArr[leftIndex] <= rArr[rightIndex]){
                    output[leftIndex + rightIndex] = lArr[leftIndex];
                    leftIndex++;
                } else {
                    output[leftIndex + rightIndex] = rArr[rightIndex];
                    rightIndex++;
                }
            } else if(leftIndex < lArr.length){
                output[leftIndex + rightIndex] = lArr[leftIndex];
                leftIndex++;
            } else {
                output[leftIndex + rightIndex] = rArr[rightIndex];
                rightIndex++;
            }

        }
        return output;
    }

    static int[] mergesort(int[] array){
        if(array.length > 1){
            int m = array.length / 2;
            int[] leftArray = mergesort(Arrays.copyOfRange(array, 0, m));
            int[] rightArray = mergesort(Arrays.copyOfRange(array, m, array.length));
            array = merge(leftArray, rightArray);
        }
        return array;
    }

    public static void sort(double[] input){

    }

    public static void sort(float[] input){

    }

    public static void sort(long[] input){

    }

    public static void sort(short[] input){

    }

    public static void main(String[] args){
        int[] intArr1 = new int[]{1, 4, 6, 2, 3, 7, 5};
        int[] sortedArray = mergesort(intArr1);
        for(int val : sortedArray){
            System.out.println(val);
        }
    }
}
