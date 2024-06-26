package cours;

import java.util.Arrays;

public class ArraysAlgo {
    public static int secondLargestNumber(int[] array){
        int max1;
        Arrays.sort(array);
        max1=array[array.length-1];
        for(int i=array.length-1; i>=0; i--){
            if(array[i]< max1){
               return array[i];
            }
        }
        System.out.println("second largest notfound");
        return -1;
    }
    public static int[] rotateArray(int [] array){
        int [] result= new int[array.length];
        if (result.length - 1 >= 0)
            System.arraycopy(array, 1, result, 0, result.length - 1);
        result[result.length-1]=array[0];
        return result;
    }
    public static int[] insertElement(int [] array, int el, int index){
        int [] result= new int[array.length+1];
        result[index]=el;
        for(int i=0; i< array.length; i++){
            if(i<index){
                result[i]= array[i];
            }
            else {
                result[i+1]=array[i];
            }
        }
        return result;
    }
    public static int [] deleteElement(int[] array, int index){
        int [] result= new int[array.length-1] ;
        for(int i=0; i<result.length; i++){
            if(i<index){
                result[i]=array[i];
            }else{
                result[i]=array[i+1];
            }
        }
        return result;
    }
    public static  int[] reverseCopyArray(int [] array){
        int[] result=new int[array.length];
        for(int i=array.length-1, j=0 ; i>=0; i-- , j++){
            result[j]=array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arrayTest = {10,3, 5, 8, 9, 1};
        System.out.println(Arrays.toString(reverseCopyArray(arrayTest)));

    }
}
