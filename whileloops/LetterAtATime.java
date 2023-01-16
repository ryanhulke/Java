package whileloops;
import java.util.*;
public class LetterAtATime {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        String message = kb.nextLine();
        System.out.print("Your message is " + message.length() + " characters long.\nThe first character is at position 0 and is '");
        System.out.print(message.charAt(0) + "'.\ntThe last character is at position " +( message.length() - 1) + " and is '");
        System.out.println(message.charAt(message.length()-1) + "'.");
        System.out.println("here are all the characters, one at a time: ");
        int numOfA = 0;
        for (int i = 0; i < message.length(); i++){
            System.out.println(i + " - '" + message.charAt(i) + "'");
            if (message.charAt(i) == 'a' || message.charAt(i) == 'A'){
                numOfA++;
            }
        }
        System.out.println("\nYour message contains the letter 'a' " + numOfA + " times. Isn't that interesting?");
        kb.close();
    }
}
