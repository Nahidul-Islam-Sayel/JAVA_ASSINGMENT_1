
package quc9;

import java.util.Scanner;
public class Quc9 {

   
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int x,y,z;
       x=s.nextInt();
       y=s.nextInt();
       z=s.nextInt();
       if(x>=y&&x>=z)System.out.println(x);
       else if(y>=x&&y>=z)System.out.println(y);
       else System.out.println(z);
    }
    
}
