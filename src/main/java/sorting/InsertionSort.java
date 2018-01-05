package sorting;

public class InsertionSort {

    public static void sort(int[] input){
        int i = 0;
        int tempVal;
        int j;

        while(i < input.length - 1){
            tempVal = input[i];
            j=i;
            while(j >= 0 && input[j] > tempVal){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tempVal;
            i++;
        }
    }

    public static void sort(double[] input){
        double tempVal;
        int i = 0;
        int j;

        while(i < input.length - 1){
            tempVal = input[i];
            j=i;
            while(j >= 0 && input[j] > tempVal){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tempVal;
            i++;
        }
    }

    public static void sort(float[] input){
        float tempVal;
        int i = 0;
        int j;

        while(i < input.length - 1){
            tempVal = input[i];
            j=i;
            while(j >= 0 && input[j] > tempVal){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tempVal;
            i++;
        }
    }

    public static void sort(long[] input){
        long tempVal;
        int i = 0;
        int j;

        while(i < input.length - 1){
            tempVal = input[i];
            j=i;
            while(j >= 0 && input[j] > tempVal){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tempVal;
            i++;
        }
    }

    public static void sort(short[] input){
        short tempVal;
        int i = 0;
        int j;

        while(i < input.length - 1){
            tempVal = input[i];
            j=i;
            while(j >= 0 && input[j] > tempVal){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = tempVal;
            i++;
        }
    }

}
