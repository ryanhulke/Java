package whileloops;
public class XsAndYs {
    public static void main(String[]args){
        System.out.println("x         y\n_____________");
        for(double i = -10.0; i <=10.0 ; i+=.5){
            System.out.println(i + "    " + Math.pow(i, 2));
        }
    }
}