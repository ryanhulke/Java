package district;

import java.io.*;
import java.util.*;

public class elevator {
    public static void main(String[]args)throws IOException{
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/src/distrctone/elevator.txt"));
        while (input.hasNextLine()){
            Scanner weights = new Scanner(input.nextLine());
            int sum = 0;
            while (weights.hasNextInt()){
                sum += weights.nextInt();
            }
            System.out.println(sum);
        }
        input.close();
    }
}
