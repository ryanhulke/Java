package state;
import java.io.*;
import java.util.*;
public class Emiliano {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/state/emiliano.txt"));
        int numSets =input.nextInt();
        for (int i = 0; i < numSets; i++){
            int numWords = input.nextInt();
            input.nextLine();
            String[] words = new String[numWords];
            for (int j = 0; j < numWords; j++){
                words[j] = input.nextLine();
            }
            int numPotentialCompounds = input.nextInt();
            String[] potentialCompounds = new String[numPotentialCompounds];
            int numCompounds = 0;
            for (int j = 0; j < numPotentialCompounds; j++){
                 potentialCompounds[j] = input.nextLine();
                 int count = 0;
                 for (int y = 0; y < words.length; y++){
                     if (potentialCompounds[j].contains(words[y])){
                        count++;
                     }
                 }
                 if (count > 0) {
                    numCompounds++;
                 }
            }
            System.out.println(numCompounds);
        }
    }
}