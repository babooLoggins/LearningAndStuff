package sorting;



public class BubbleSort {

    public static void sort(int[] input){
        int tempInt;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < input.length -1; i++){
                if(input[i] > input[i+1]){
                    isSorted = false;
                    tempInt = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tempInt;
                }
            }
        }
    }

    public static void sort(double[] input){
        double tempInt;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < input.length -1; i++){
                if(input[i] > input[i+1]){
                    isSorted = false;
                    tempInt = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tempInt;
                }
            }
        }
    }

    public static void sort(float[] input){
        float tempInt;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < input.length -1; i++){
                if(input[i] > input[i+1]){
                    isSorted = false;
                    tempInt = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tempInt;
                }
            }
        }
    }

    public static void sort(long[] input){
        long tempInt;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < input.length -1; i++){
                if(input[i] > input[i+1]){
                    isSorted = false;
                    tempInt = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tempInt;
                }
            }
        }
    }

    public static void sort(short[] input){
        short tempInt;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < input.length -1; i++){
                if(input[i] > input[i+1]){
                    isSorted = false;
                    tempInt = input[i];
                    input[i] = input[i+1];
                    input[i+1] = tempInt;
                }
            }
        }
    }
}
