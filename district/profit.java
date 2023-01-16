package district;

import java.util.*;
import java.io.*;

public class profit {
    public static void main(String[] args) throws IOException {
        Scanner kb= new Scanner(new File("jerry.txt"));
        int num = 0; 
        int count = Integer.parseInt(kb.nextLine().trim());
        while(num < count){
            num++;
            String uno = kb.nextLine();
            String[] dos = uno.split(" ");
            String code = dos[0];
        String name = dos[1];
        int numItems = Integer.parseInt(dos[2]);
        double sum = 0;
        for (int i=0; i<numItems; i++) {
            uno = kb.nextLine().trim();
            String vals[] = uno.split(" ");
            String n = vals[0];
            double price = Double.parseDouble(vals[1].substring(1));
            String temp = "";
            for (int j=0; j<n.length(); j++){
                temp += (code.indexOf(n.charAt(j)));
                double net = Double.parseDouble(temp) / 100;
                sum += price - net;
            }
        }    
            System.out.printf("%s $%.2f", name, sum);
            System.out.println();
        }
    }
}
