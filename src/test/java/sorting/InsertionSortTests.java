package sorting;

import org.junit.Test;

import java.util.Set;

public class InsertionSortTests {

    @Test
    public void testDoubleInsertionSort(){
        Set<double[]> doubleTestSet = TestData.getDoubleTestData();
        int i = 0;
        for(double[] testSet : doubleTestSet){
            InsertionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedDoubleArray(testSet));
        }
    }

    @Test
    public void testFloatInsertionSort(){
        Set<float[]> doubleTestSet = TestData.getFloatTestData();
        int i = 0;
        for(float[] testSet : doubleTestSet){
            InsertionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedFloatArray(testSet));
        }
    }

    @Test
    public void testIntInsertionSort(){
        Set<int[]> intTestSet = TestData.getIntTestData();
        int i = 0;
        for(int[] testSet : intTestSet){
            InsertionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedIntArray(testSet));
        }
    }

    @Test
    public void testLongInsertionSort(){
        Set<long[]> doubleTestSet = TestData.getLongTestData();
        int i = 0;
        for(long[] testSet : doubleTestSet){
            InsertionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedLongArray(testSet));
        }
    }

    @Test
    public void testShortInsertionSort(){
        Set<short[]> doubleTestSet = TestData.getShortTestData();
        int i = 0;
        for(short[] testSet : doubleTestSet){
            InsertionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedShortArray(testSet));
        }
    }
}
