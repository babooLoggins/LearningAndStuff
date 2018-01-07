package sorting;

import org.junit.Test;

import java.util.Set;

public class QuickSortTests {

    @Test
    public void testDoubleQuickSort(){
        Set<double[]> doubleTestSet = TestData.getDoubleTestData();
        int i = 0;
        for(double[] testSet : doubleTestSet){
            QuickSort.sort(testSet, 0, testSet.length-1);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedDoubleArray(testSet));
        }
    }

    @Test
    public void testFloatQuickSort(){
        Set<float[]> doubleTestSet = TestData.getFloatTestData();
        int i = 0;
        for(float[] testSet : doubleTestSet){
            QuickSort.sort(testSet, 0, testSet.length-1);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedFloatArray(testSet));
        }
    }

    @Test
    public void testIntQuickSort(){
        Set<int[]> intTestSet = TestData.getIntTestData();
        int i = 0;
        for(int[] testSet : intTestSet){
            QuickSort.sort(testSet, 0, testSet.length-1);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedIntArray(testSet));
        }
    }

    @Test
    public void testLongQuickSort(){
        Set<long[]> doubleTestSet = TestData.getLongTestData();
        int i = 0;
        for(long[] testSet : doubleTestSet){
            QuickSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedLongArray(testSet));
        }
    }

    @Test
    public void testShortQuickSort(){
        Set<short[]> doubleTestSet = TestData.getShortTestData();
        int i = 0;
        for(short[] testSet : doubleTestSet){
            QuickSort.sort(testSet, 0, testSet.length-1);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedShortArray(testSet));
        }
    }
}
