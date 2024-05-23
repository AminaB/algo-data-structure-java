package cours;

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
    public static int[][] multiplyMatrix(int[][] m1,int[][]m2){
        int [][] mult= new int[m1.length][m2[0].length];
        // matrix have same size and not null
        for(int i=0;i< m1.length; i++){
            for(int j=0;j< m1[i].length; j++){
                for(int k=0;k< m2[0].length; k++) {
                    mult[i][j] += m1[i][k] * m2[k][j];
                }

            }

        }
        return mult;
    }
    public static void main(String[] args) {
        int[][] arrayTest = {
                {1, 3, 5},
                {5, 2, 5},
                {2, 2, 1},
        };
        int[][] arrayTest2 = {
                {1, 1, 2},
                {2, 1, 0},
                {2, 2, 1},
        };
        System.out.println(Arrays.deepToString(multiplyMatrix(arrayTest, arrayTest2)));
    }
}
