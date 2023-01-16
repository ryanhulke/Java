package district;
import java.io.*;
import java.util.*;

public class students {
    public static void main(String[]args)throws IOException {
        Scanner kb = new Scanner(new File("people.txt"));
        int count = Integer.parseInt(kb.nextLine().trim());
        int []bar = {0,0,0,0,0,0,0};
        for(int z=0; z<count; z++) {
            String t = kb.nextLine().trim();
            String []n = t.split(" "); 
            int num = Integer.valueOf(n[n.length - 1]);
            for (int i = 0; i < 7; i++){
                if (num < (i + 4) * 10){
                    bar[i]++;
                }
            }
        }
        System.out.print("   <40: ");
        for(int z=0; z<bar[0]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print(" 40-49: ");
        for(int z=0; z<bar[1]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print(" 50-59: ");
        for(int z=0; z<bar[2]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print(" 60-69: ");
        for(int z=0; z<bar[3]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print(" 70-79: ");
        for(int z=0; z<bar[4]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print(" 80-89: ");
        for(int z=0; z<bar[5]; z++)
            System.out.print("*");
        System.out.println();
        System.out.print("90-100: ");
        for(int z=0; z<bar[6]; z++)
            System.out.print("*");
    }
}
