package sorting;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class BubbleSortTests {
    int[] intArr1 = new int[]{1, 4, 6, 2, 3, 7, 5};
    int[] intArr2 = new int[]{1, 4, 6};
    int[] intArr3 = new int[]{6, 4, 1};
    int[] intArr4 = new int[]{6};

    private boolean isSorted(int[] sortedArray){
        boolean isSorted = true;
        if(sortedArray.length>1){
            for(int i = 1; i<sortedArray.length; i++){
                if(sortedArray[i]<sortedArray[i-1])
                    isSorted = false;
            }
        }
        return isSorted;
    }

    @Test
    public void testIntBubbleSort(){
        Set<int[]> intTestSet = new HashSet<int[]>();
        intTestSet.add(intArr1);
        intTestSet.add(intArr2);
        intTestSet.add(intArr3);
        intTestSet.add(intArr4);
        int i = 0;
        for(int[] testSet : intTestSet){
            BubbleSort.sort(testSet);
            i++;
            System.out.println("Testing set " + i);
            assert(isSorted(testSet));

        }
    }

}
