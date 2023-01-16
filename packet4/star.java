import java.io.*;
import java.util.*;

public class star {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/packet4/star.txt"));
        int numSets = input.nextInt();
        for (int i = 0; i < numSets; i++){
            int numPeople = input.nextInt();
            int highestScore = 0;
            String winner = "";
            for (int j = 0; j < numPeople; j++){
                String temp = input.next();
                int score = input.nextInt();
                if (score > highestScore){
                    highestScore = score;
                    winner = temp;
                }
            }
            System.out.println(winner + " " + highestScore);
        }
    }
}