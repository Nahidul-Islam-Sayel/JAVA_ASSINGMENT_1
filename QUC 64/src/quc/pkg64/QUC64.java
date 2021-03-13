
package quc.pkg64;
import java.util.Scanner;

import static java.lang.Math.pow;
public class QUC64 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Please Enter Milisecond");
      int x;
       x=s.nextInt();
        System.out.println("Second "+x*0.001);
         System.out.println("Minite "+x*(1.6666667)*pow(10,-5));
       
    }
    
}
