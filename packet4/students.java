import java.io.*;
import java.util.*;

public class students {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/packet4/students.txt"));
        int numSets = input.nextInt();
        for (int i = 0; i < numSets; i++){
            int numPeople = input.nextInt();
            String[] ppl = new String[numPeople];
            int[] scores = new int[numPeople];
            int temp;
            String tempName;
            for (int j = 0; j < numPeople; j++){
                ppl[j] = input.next();
                scores[j] = input.nextInt();
            }
            Boolean inOrder = false;
            while (!inOrder){
                inOrder = true;
                for (int j = 0; j < ppl.length-1; j++){
                    if (scores[j] < scores[j+1]){
                        temp = scores[j];
                        scores[j] = scores[j+1];
                        scores[j+1] = temp;
                        tempName = ppl[j];
                        ppl[j] = ppl[j+1];
                        ppl[j+1] = tempName;
                        inOrder = false;
                    }
                }
            }
                for (int j = 0; j < scores.length; j++){
                System.out.println(ppl[j] + " " +  scores[j]);
                }
                if (input.hasNextLine())
                    System.out.println();
        }
    }
}