
package quc.pkg13;

import java.util.Scanner;
public class Quc13 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char x;
        x=s.next().charAt(0);
        if((x>='a'&&x<='z')||(x>='A'&&x<='Z'))System.out.println("Alphabate");
        else System.out.println("Not");
    }
    
}
