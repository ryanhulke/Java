package regional;
import java.io.*;
import java.util.*;
public class EtchASketch {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(new File("C:/Users/rshul/OneDrive/Code/JavaProjects/regional/EtchASketch.txt"));
        char [][] screen = new char[10][10];
        for (int i = 0; i < screen.length; i++){
            for (int j = 0; j < screen[i].length; j++){
                screen[i][j] = '-';
            }
        }
        int startX = input.nextInt(), startY = input.nextInt();
        while (input.hasNext()){
            String nextMove = input.next();
            char direction = nextMove.charAt(0);
            System.out.println(direction);
            int moveDist = Integer.parseInt(nextMove.substring(1));
            if (direction == 'r'){
                for (int i = 0; i < moveDist; i++){
                    screen[startX + i][startY] = '*';
                }
            } else if (direction == 'l'){
                for (int i = 0; i < moveDist; i++){
                    screen[startX - i][startY] = '*';
                }
            } else if (direction == 'u'){
                for (int i = 0; i < moveDist; i++){
                    screen[startX][startY - i] = '*';
                }
            } else if (direction == 'd'){
                for (int i = 0; i < moveDist; i++){
                    screen[startX][startY + i] = '*';
                }
            } 
        }
        for (int i = 0; i < screen.length; i++){
            for (int j = 0; j < screen[i].length; j++){
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }
}