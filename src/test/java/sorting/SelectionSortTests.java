package sorting;

import org.junit.Test;

import java.util.Set;

public class SelectionSortTests {

    @Test
    public void testDoubleSelectionSort(){
        Set<double[]> doubleTestSet = TestData.getDoubleTestData();
        int i = 0;
        for(double[] testSet : doubleTestSet){
            SelectionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedDoubleArray(testSet));
        }
    }

    @Test
    public void testFloatSelectionSort(){
        Set<float[]> doubleTestSet = TestData.getFloatTestData();
        int i = 0;
        for(float[] testSet : doubleTestSet){
            SelectionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedFloatArray(testSet));
        }
    }

    @Test
    public void testIntSelectionSort(){
        Set<int[]> intTestSet = TestData.getIntTestData();
        int i = 0;
        for(int[] testSet : intTestSet){
            SelectionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedIntArray(testSet));
        }
    }

    @Test
    public void testLongSelectionSort(){
        Set<long[]> doubleTestSet = TestData.getLongTestData();
        int i = 0;
        for(long[] testSet : doubleTestSet){
            SelectionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedLongArray(testSet));
        }
    }

    @Test
    public void testShortSelectionSort(){
        Set<short[]> doubleTestSet = TestData.getShortTestData();
        int i = 0;
        for(short[] testSet : doubleTestSet){
            SelectionSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedShortArray(testSet));
        }
    }
}
