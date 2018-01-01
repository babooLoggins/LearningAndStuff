package sorting;

import org.junit.Test;

import java.util.Set;


public class BubbleSortTests {

    @Test
    public void testIntBubbleSort(){
        Set<int[]> intTestSet = TestData.getIntTestData();
        int i = 0;
        for(int[] testSet : intTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedIntArray(testSet));
        }
    }

    @Test
    public void testDoubleBubbleSort(){
        Set<double[]> doubleTestSet = TestData.getDoubleTestData();
        int i = 0;
        for(double[] testSet : doubleTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedDoubleArray(testSet));
        }
    }

    @Test
    public void testLongBubbleSort(){
        Set<long[]> doubleTestSet = TestData.getLongTestData();
        int i = 0;
        for(long[] testSet : doubleTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedLongArray(testSet));
        }
    }

    @Test
    public void testFloatBubbleSort(){
        Set<float[]> doubleTestSet = TestData.getFloatTestData();
        int i = 0;
        for(float[] testSet : doubleTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedFloatArray(testSet));
        }
    }

    @Test
    public void testShortBubbleSort(){
        Set<short[]> doubleTestSet = TestData.getShortTestData();
        int i = 0;
        for(short[] testSet : doubleTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(SortingChecker.isSortedShortArray(testSet));
        }
    }

}
