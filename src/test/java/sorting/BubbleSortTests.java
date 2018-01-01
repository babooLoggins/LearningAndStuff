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

}
