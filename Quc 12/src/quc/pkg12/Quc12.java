
package quc.pkg12;

import java.util.Scanner;
public class Quc12 {

  
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        if(x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Nagetive");
        }
        else System.out.println("Zero");
    }
    
}
