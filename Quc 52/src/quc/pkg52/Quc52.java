
package quc.pkg52;

import java.util.Scanner;
public class Quc52 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       double x,y;
       x=s.nextFloat();
       y=s.nextFloat();
       show(x,y);
    }
    public static void show(double x,double y){
        System.out.println(x+y);
    }
    
}
