package district;
import java.io.*;
import java.util.*;
public class shake {
    public static void main(String[]args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/src/distrctone/shake.java"));
        while(input.hasNextLine()){
            char[] temp = input.nextLine().toCharArray();
            char[][] characters = new char[6][6];
            for (int i = 1; i < 7; i++){
                for (int j = 1; j < 7; j++){
                    characters[i-1][j-1] = temp[i*j-1];
                    System.out.println(characters[i-1][j-1]);
                }
            }
        }
    }
}
