
package quc.pkg24;

import java.util.Scanner;
public class Quc24 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int p;
      p=s.nextInt();
      int now=p,reverse=0;
      while(p!=0){
          int f=p%10;
          reverse=reverse*10+f;
          p/=10;
      }
      if(reverse==now)System.out.println("It is a Palindrome");
      else System.out.println("It is not Palindrome");
     
    }
    
}
