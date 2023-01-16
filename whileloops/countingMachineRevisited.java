package whileloops;
import java.util.*;
public class countingMachineRevisited {
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Count from: ");
            int startPoint = kb.nextInt();
            System.out.print("Count to  : ");
            int endPoint = kb.nextInt();
            System.out.print("Count by  : ");
            int factor = kb.nextInt();
            for (int j = startPoint; j <= endPoint; j+=factor){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        kb.close();
    }
}