package twodimarrays;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[]args){
        int[][] A = {{1, 1, 1},
                     {2, 2, 2},
                     {3, 3, 3},
                     {4, 4, 4}};
        int[][] B = {{1, 1, 1, 1},
                    {2, 2, 2, 2},
                    {3, 3, 3, 3}};

        System.out.println(matrixMultiplication(A, B));
    }

    public static String matrixMultiplication (int[][] A, int[][] B){
        int[][] product = new int[Math.max(A.length, A[0].length)][Math.max(B.length, B[0].length)];

        for (int i = 0; i < product.length; i++){     // rows
            for (int j = 0; j < product[0].length; j++){      // columns
                for (int k = 0; k < B.length; k++){     // operations
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return Arrays.deepToString(product);
    }
}