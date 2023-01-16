package regional;
import java.io.*;
import java.util.*;
public class remnants {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/regional/remnants.txt"));
        while (input.hasNextDouble()){
            System.out.println(Math.ceil((input.nextDouble()*3) / 14));
        }
    }
}