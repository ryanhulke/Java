package regional;
import java.io.*;
import java.util.*;
public class Bases {
    public static void main(String[]args)throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/regional/bases.txt"));
        int num = input.nextInt();
        String[][] bases = new String[6][num];
        int base = 2;
        for (int i = 0; i < bases.length; i++){
            if (base != 6 && base != 14){           //skipping unwanted bases
                for (int j = 0; j < num; j++){
                        bases[i][j] = Integer.toString(j+1, base);  // setting values
                }
            }else {
                i--;
            }
            base += 2;
        }
        System.out.println("Base 2    Base 4    Base 8    Base 10   Base 12   Base 16");
        for (int i = 0; i < bases[0].length; i++){
            for (int j = 0; j < bases.length; j++){
                System.out.print(bases[j][i]);                  // printing values
                for (int n = 0; n < 10 - bases[j][i].length(); n++){
                    System.out.print(" ");          // printing desired space between nums
                }

            }
            System.out.println();
        }
    }
}