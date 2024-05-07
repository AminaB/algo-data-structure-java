import java.util.Arrays;

public class Arrays2DAlgo {
    public static int[][] addingMatrix(int[][] m1,int[][]m2){
        int [][] sum= new int[m1.length][m1[0].length];
       // matrix have same size and not null
        for(int i=0;i< m1.length; i++){
            for(int j=0;j< m1[i].length; j++){
                sum[i][j]= m1[i][j]+ m2[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arrayTest = {
                {10, 3, 5, 8},
                {5, 2, 5, 5},
                {5, 2, 5, 5},
        };
        int[][] arrayTest2 = {
                {10, 3, 5, 8},
                {5, 2, 5, 5},
                {5, 2, 5, 5},
        };
        System.out.println(Arrays.deepToString(addingMatrix(arrayTest, arrayTest2)));
    }
}
