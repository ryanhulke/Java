import java.io.*;
import java.util.*;

public class thankyou {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/packet4/thankyou.txt"));
        while(input.hasNextLine()){
            System.out.println("Thank You " + input.next());
        }
    }
}