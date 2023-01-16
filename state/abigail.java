package state;
import java.io.*;
import java.util.*;
public class abigail {
    public static void main(String[]args) throws IOException {
        Scanner in = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/state/abigail.txt"));
        while (in.hasNextLine()){
            int a = in.nextInt();
            String b = String.valueOf(in.nextInt());
            int c = in.nextInt();
            if (c >= 0 && Math.sqrt(c) % 1 == 0){       // c = positive square
                a += Integer.valueOf(b) * Math.sqrt(c);
                b = "0";
                c = 0;
                
            } else if (c < 0 && Math.sqrt(c*-1) % 1 == 0){      // c = negative square
                b = String.valueOf(Integer.valueOf(b) * Math.sqrt(c*-1)) + "i";
                c = 0;
            } else if (c < 0 && Math.sqrt(c*-1) % 1 != 0){      // c = negative, not a square
                int i = 4;
                while (i < 100){
                    if (Math.sqrt(i) % 1 == 0){
                        if (c % i == 0){
                            c /= -i;
                            b = String.valueOf(Integer.valueOf(b) * Math.sqrt(i)) + "i";
                            break;
                        }
                    }
                    i++;
                } 
            } else {        // c = positive, not a square
                int j = 4;
                while (j < 100){
                    if (Math.sqrt(j) % 1 == 0){
                        if (c % j == 0){
                            c /= j;
                            b = String.valueOf(Integer.valueOf(b) * Math.sqrt(j));
                            break;
                        }
                    }
                    j++;
                } 
            }
            System.out.println(a + " " + b + " " + c);
        }
    }
}