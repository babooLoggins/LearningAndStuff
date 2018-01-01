package sorting;

public class SortingChecker {
    public static boolean isSortedIntArray(int[] array){
        boolean isSorted = true;
        if(array.length>1){
            for(int x = 1; x < array.length; x++){
                if(array[x] < array[x-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

    public static boolean isSortedDoubleArray(double[] array){
        boolean isSorted = true;
        if(array.length>1){
            for(int x = 1; x < array.length; x++){
                if(array[x] < array[x-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

    public static boolean isSortedFloatArray(float[] array){
        boolean isSorted = true;
        if(array.length>1){
            for(int x = 1; x < array.length; x++){
                if(array[x] < array[x-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

    public static boolean isSortedLongArray(long[] array){
        boolean isSorted = true;
        if(array.length>1){
            for(int x = 1; x < array.length; x++){
                if(array[x] < array[x-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

    public static boolean isSortedShortArray(short[] array){
        boolean isSorted = true;
        if(array.length>1){
            for(int x = 1; x < array.length; x++){
                if(array[x] < array[x-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

}
