package quc5;
import java.util.Scanner;
public class Quc5 {

   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int x,y,q,r;
       x=s.nextInt();
       y=s.nextInt();
       q=x/y;
       r=x%y;
       System.out.println("Quotient = " +q+"Remainder = " +r);
       
       
    }
    
}
