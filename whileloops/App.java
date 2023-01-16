package whileloops;

// 5.13 it would be an infinite loop
// you could change the count to count -= 1 instead of +=1, 
// you could change the condition to be >= a number higher than 50,
//you could change the count to start at a negative number and flip the condition sign

import java.util.*;

public class App {
    public static void main(String[] args) {
        
        // 5.14
        Scanner kb = new Scanner(System.in);
        while (kb.nextInt() > 0 ){
            System.out.println("thats a positive integer");
        }
        
        // 5.15
        do {
            System.out.println("thats even");
        } while (kb.nextInt() % 2 == 0);

        // 5.16 
        int SENTINEL = 15;
        boolean isSentinel = false;
        while (isSentinel==false){
            int num = kb.nextInt();
            if (num != SENTINEL){
                System.out.println(num);
            } else {
                isSentinel = true;
            }
        }

        // 5.17 
        for (int i = 0; i < 100; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }

        // 5.18
        for (int i = 3; i <=300; i+=3){
            System.out.print(i + " ");
        }

        // 5.19
        int[] inputs = new int[10];
        int max = 0;
        for (int i = 0; i < inputs.length; i++){
            inputs[i] = kb.nextInt();
            if (i > 0) {
                if (inputs[i] > inputs[i-1]){
                    max = inputs[i];
                }
            }
        }
        System.out.println(max);
        kb.close();

        // 5.20
        String name = "Jackson Jacobs";
        char[] nameArray = name.toCharArray();
        int count = 0;
        for (int i = 0; i < nameArray.length; i++){
            if (nameArray[i] == 'a'){
                count += 1;
            }
        }
        System.out.println(count);

        // 5.21
        String backwards = "Ryan Hulke";
        char[] backwardsChars = backwards.toCharArray();
        for (int i = 0; i < backwardsChars.length/2; i++){
            char temp = backwardsChars[i];
            backwardsChars[i] = backwardsChars[backwardsChars.length - i - 1];
            backwardsChars[backwardsChars.length - i - 1] = temp;
        }
        backwards = String.valueOf(backwardsChars);
        System.out.println(backwards);

        // 5.22
        String everyOther = "print every other character here";
        for (int i = 0; i < everyOther.length(); i++){
            if (i % 2 == 0){
                System.out.print(everyOther.charAt(i));
            }
        }
    }
}

