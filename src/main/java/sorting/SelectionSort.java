package sorting;

public class SelectionSort {

    public static void sort(double[] input){
        double min;
        int minIndex;
        for(int i = 0; i< input.length; i++){
            min = input[i];
            minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
    }

    public static void sort(float[] input){
        float min;
        int minIndex;
        for(int i = 0; i< input.length; i++){
            min = input[i];
            minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
    }

    public static void sort(int[] input){
        int min;
        int minIndex;
        for(int i = 0; i< input.length; i++){
            min = input[i];
            minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
    }

    public static void sort(long[] input){
        long min;
        int minIndex;
        for(int i = 0; i< input.length; i++){
            min = input[i];
            minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
    }

    public static void sort(short[] input){
        short min;
        int minIndex;
        for(int i = 0; i< input.length; i++){
            min = input[i];
            minIndex = i;
            for(int j = i; j < input.length; j++){
                if(input[j] < min){
                    min = input[j];
                    minIndex = j;
                }
            }
            input[minIndex] = input[i];
            input[i] = min;
        }
    }

    public static void main(String[] args){
        final double[] doubleArr1 = new double[]{1.3, 4.2, 6.4, 2.3, 3.1, 7.4, 7.1};
        sort(doubleArr1);
        for(double d : doubleArr1){
            System.out.println(d);
        }
    }
}
