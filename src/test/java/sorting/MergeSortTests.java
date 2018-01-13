package sorting;

import org.junit.Test;

import java.util.Set;

public class MergeSortTests {

    @Test
    public void testDoubleMergeSort(){
        Set<double[]> doubleTestSet = TestData.getDoubleTestData();
        int i = 0;
        for(double[] testSet : doubleTestSet){
            MergeSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedDoubleArray(testSet));
        }
    }

    @Test
    public void testFloatMergeSort(){
        Set<float[]> doubleTestSet = TestData.getFloatTestData();
        int i = 0;
        for(float[] testSet : doubleTestSet){
            MergeSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedFloatArray(testSet));
        }
    }

    @Test
    public void testIntMergeSort(){
        Set<int[]> intTestSet = TestData.getIntTestData();
        int i = 0;
        for(int[] testSet : intTestSet){
            MergeSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedIntArray(testSet));
        }
    }

    @Test
    public void testLongMergeSort(){
        Set<long[]> doubleTestSet = TestData.getLongTestData();
        int i = 0;
        for(long[] testSet : doubleTestSet){
            MergeSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedLongArray(testSet));
        }
    }

    @Test
    public void testShortMergeSort(){
        Set<short[]> doubleTestSet = TestData.getShortTestData();
        int i = 0;
        for(short[] testSet : doubleTestSet){
            MergeSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedShortArray(testSet));
        }
    }
}
