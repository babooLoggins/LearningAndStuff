package sorting;

import java.util.Arrays;

public class MergeSort {

    static double[] mergeDouble(double[] lArr, double[] rArr){
        int totalLength = lArr.length+rArr.length;
        double[] output = new double[totalLength];
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

    public static double[] sort(double[] array){
        if(array.length > 1){
            int m = array.length / 2;
            double[] leftArray = sort(Arrays.copyOfRange(array, 0, m));
            double[] rightArray = sort(Arrays.copyOfRange(array, m, array.length));
            array = mergeDouble(leftArray, rightArray);
        }
        return array;
    }

    static int[] mergeInt(int[] lArr, int[] rArr){
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

    static int[] sort(int[] array){
        if(array.length > 1){
            int m = array.length / 2;
            int[] leftArray = sort(Arrays.copyOfRange(array, 0, m));
            int[] rightArray = sort(Arrays.copyOfRange(array, m, array.length));
            array = mergeInt(leftArray, rightArray);
        }
        return array;
    }

    static float[] mergeFloat(float[] lArr, float[] rArr){
        int totalLength = lArr.length+rArr.length;
        float[] output = new float[totalLength];
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

    public static float[] sort(float[] array){
        if(array.length > 1){
            int m = array.length / 2;
            float[] leftArray = sort(Arrays.copyOfRange(array, 0, m));
            float[] rightArray = sort(Arrays.copyOfRange(array, m, array.length));
            array = mergeFloat(leftArray, rightArray);
        }
        return array;
    }

    static long[] mergeLong(long[] lArr, long[] rArr){
        int totalLength = lArr.length+rArr.length;
        long[] output = new long[totalLength];
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

    public static long[] sort(long[] array){
        if(array.length > 1){
            int m = array.length / 2;
            long[] leftArray = sort(Arrays.copyOfRange(array, 0, m));
            long[] rightArray = sort(Arrays.copyOfRange(array, m, array.length));
            array = mergeLong(leftArray, rightArray);
        }
        return array;
    }

    static short[] mergeShort(short[] lArr, short[] rArr){
        int totalLength = lArr.length+rArr.length;
        short[] output = new short[totalLength];
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

    public static short[] sort(short[] array){
        if(array.length > 1){
            int m = array.length / 2;
            short[] leftArray = sort(Arrays.copyOfRange(array, 0, m));
            short[] rightArray = sort(Arrays.copyOfRange(array, m, array.length));
            array = mergeShort(leftArray, rightArray);
        }
        return array;
    }

    public static void main(String[] args){
        int[] intArr1 = new int[]{1, 4, 6, 2, 3, 7, 5};
        int[] sortedArray = sort(intArr1);
        for(int val : sortedArray){
            System.out.println(val);
        }
    }
}
