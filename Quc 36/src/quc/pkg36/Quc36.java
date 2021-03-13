
package quc.pkg36;
import java.util.Scanner;
public class Quc36 {

     public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int x,y;
       x=scan.nextInt();
       y=scan.nextInt();
        int h = gcd(x, y);

        System.out.println(h);
    }

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    
}
