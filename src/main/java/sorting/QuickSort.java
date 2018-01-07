package sorting;

public class QuickSort {

    protected static void swap(double[] array, int i, int j){
        double tempDouble;
        tempDouble = array[i];
        array[i] = array[j];
        array[j] = tempDouble;
    }
    protected static int partition(double[] array, int low, int high){
        double pivot = array[high];
        int wall = low;

        for(int i = low; i <=high-1; i++){
            if(array[i] <= pivot){
                swap(array, i, wall);
                wall++;
            }
        }
        swap(array, high, wall);
        return wall;
    }

    public static void sort(double[] input, int low, int high){
        if(low < high){
            int pivotIndex = partition(input, low, high);
            sort(input, low, pivotIndex-1);
            sort(input, pivotIndex+1, high);
        }

    }

    protected static void swap(float[] array, int i, int j){
        float tempFloat;
        tempFloat = array[i];
        array[i] = array[j];
        array[j] = tempFloat;
    }
    protected static int partition(float[] array, int low, int high){
        double pivot = array[high];
        int wall = low;

        for(int i = low; i <=high-1; i++){
            if(array[i] <= pivot){
                swap(array, i, wall);
                wall++;
            }
        }
        swap(array, high, wall);
        return wall;
    }

    public static void sort(float[] input, int low, int high){
        if(low < high){
            int pivotIndex = partition(input, low, high);
            sort(input, low, pivotIndex-1);
            sort(input, pivotIndex+1, high);
        }
    }

    protected static void swap(int[] array, int i, int j){
        int tempInt;
        tempInt = array[i];
        array[i] = array[j];
        array[j] = tempInt;
    }
    protected static int partition(int[] array, int low, int high){
        double pivot = array[high];
        int wall = low;

        for(int i = low; i <=high-1; i++){
            if(array[i] <= pivot){
                swap(array, i, wall);
                wall++;
            }
        }
        swap(array, high, wall);
        return wall;
    }

    public static void sort(int[] input, int low, int high){
        if(low < high){
            int pivotIndex = partition(input, low, high);
            sort(input, low, pivotIndex-1);
            sort(input, pivotIndex+1, high);
        }
    }

    protected static void swap(long[] array, int i, int j){
        long tempLong;
        tempLong = array[i];
        array[i] = array[j];
        array[j] = tempLong;
    }
    protected static int partition(long[] array, int low, int high){
        long pivot = array[high];
        int wall = low;

        for(int i = low; i <=high-1; i++){
            if(array[i] <= pivot){
                swap(array, i, wall);
                wall++;
            }
        }
        swap(array, high, wall);
        return wall;
    }

    public static void sort(long[] input, int low, int high){
        if(low < high){
            int pivotIndex = partition(input, low, high);
            sort(input, low, pivotIndex-1);
            sort(input, pivotIndex+1, high);
        }
    }

    protected static void swap(short[] array, int i, int j){
        short tempShort;
        tempShort = array[i];
        array[i] = array[j];
        array[j] = tempShort;
    }
    protected static int partition(short[] array, int low, int high){
        short pivot = array[high];
        int wall = low;

        for(int i = low; i <=high-1; i++){
            if(array[i] <= pivot){
                swap(array, i, wall);
                wall++;
            }
        }
        swap(array, high, wall);
        return wall;
    }

    public static void sort(short[] input, int low, int high){
        if(low < high){
            int pivotIndex = partition(input, low, high);
            sort(input, low, pivotIndex-1);
            sort(input, pivotIndex+1, high);
        }
    }

    public static void main(String[] args){
        final double[] doubleArr1 = new double[]{1.3, 4.2, 6.4, 2.3, 3.1, 7.4, 7.1};
        sort(doubleArr1, 0, doubleArr1.length-1);
        for(double d : doubleArr1){
            System.out.println(d);
        }
    }
}
