
package quc.pkg32;

import java.util.Scanner;
public class Quc32 {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      double x,y;
      char o;
      System.out.println("You must be use a space between oparator and 2 number For example 2 + 4");
      System.out.println("Enter everything:");
      x=s.nextDouble();
      o=s.next().charAt(0);
      y=s.nextDouble();
      
      switch(o){
          case '+':
           System.out.println(x+y);
           break;
           case '-':
           System.out.println(x-y);
           break;
           case '*':
           System.out.println(x*y);
           break;
           case '/':
           System.out.println(x/y);
           break;
           case '%':
           System.out.println(x%y);
           break;
                  
      }      
    }
    
}
