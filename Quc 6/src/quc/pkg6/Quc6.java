
package quc.pkg6;
import java.util.Scanner;
public class Quc6 {

   
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int p,q,temp;
        p=s.nextInt();
        q=s.nextInt();
         System.out.println("After Swaping "+ p+" "+q);
        temp=p;
        p=q;
        q=temp;
        System.out.println("Before Swaping "+ p+" "+q);
    }
    
}
