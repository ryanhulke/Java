import java.io.*;
import java.util.*;

public class sudoku {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/packet4/sudoku.txt"));
        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                sudoku[i][j] = input.nextInt();     // storing sudoku in 2d array
            }
        }
        Boolean solved = false;
        while (!solved){
            solved = true;
            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 9; j++){
                    if (sudoku[i][j] == 0){
                        solved = false;
                        int[] nums = new int[27];
                        for (int k = 0; k < 9; k++){        
                            nums[k] = sudoku[i][k];
                        }
                        for (int k = 0; k < 9; k++){
                            nums[k+9] = sudoku[k][j];       // collecting all the numbers the answer can't be
                        }
                        int m = 0;
                        for (int k = i - i % 3; k < (i - i % 3)+3; k++){
                            for (int n = j - j % 3; n < (j - j % 3)+3; n++){
                                nums[m+18] = sudoku[k][n]; 
                                m++;
                            }
                        }
                        int[] numsPoss = {1,2,3,4,5,6,7,8,9};
                        for (int k = 0; k < 9; k++){
                            for (int n = 0; n < 27; n++){           // setting possible answers
                                if (nums[n] != 0){
                                    if (nums[n] == numsPoss[k]){
                                        numsPoss[k] = 0;
                                    }
                                }
                            }
                        }
                        int numPossibilities = 0;
                        int temp = 0;
                        for (int k = 0; k < 9; k++){          // finding the number of possible answers
                            if (numsPoss[k] != 0){
                                if (numsPoss[k] != temp){
                                    temp = numsPoss[k];
                                    numPossibilities++;
                                }
                            }
                        }
                        if (numPossibilities == 1){
                            for (int k = 0; k < 9; k++){
                                if (numsPoss[k] != 0){          // setting answer if found
                                    sudoku[i][j] = numsPoss[k];
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}