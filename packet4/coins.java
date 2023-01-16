import java.io.*;
import java.util.*;

public class coins {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/packet4/coins.txt"));
        int numSets = input.nextInt();
        for (int i = 0; i < numSets; i++){
            int amount = input.nextInt();
            int numCoins = input.nextInt();
            Boolean isPossible = false;
            for (int j = 0; j < numCoins; j++){
                if (amount % input.nextInt() == 0 ){
                    isPossible = true;
                    break;
                } else {
                    isPossible = false;
                }
            }
            if (isPossible){
                System.out.println("Possible");
            } else {
                System.out.println("Not Possible");
            }
        }
    }
}