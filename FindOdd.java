import org.junit.Test;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
public class FindOdd {
    public static int findOccur(int val, int[] tab){
        int count =0;
        for(int v : tab){
            if(v==val)
                count ++;

        }
        return count;
    }
    public static int findIt(int[] array){
        int odd=0;
        if(array.length==1)
            return array[0];
        int imp=findOccur(array[0],array);
        for(int val: Arrays.stream(array).distinct().toArray()){
            int countNbVal =findOccur(val,array);
            if(imp%2!=0){
                if(countNbVal<imp && countNbVal%2!=0){
                  imp=countNbVal;
                  odd=val;
              }
            }else{
                if(countNbVal%2!=0){
                    imp=countNbVal;
                    odd=val;
                }
            }
        }
        return odd;
    }
    @Test
    public void findTest() {
        assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5})); assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5})); assertEquals(10, FindOdd.findIt(new int[]{10})); assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1})); assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        }
    }

