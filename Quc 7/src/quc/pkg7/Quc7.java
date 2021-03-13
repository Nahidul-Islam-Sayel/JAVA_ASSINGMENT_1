
package quc.pkg7;

import java.util.Scanner;
public class Quc7 {
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        x= s.nextInt();
        if(x%2==0)
            System.out.println("You enter a even number");
        else System.out.println("You enter a odd number");
    }
    
}
