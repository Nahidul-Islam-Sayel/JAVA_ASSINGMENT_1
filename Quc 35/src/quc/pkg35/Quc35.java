
package quc.pkg35;

import java.util.Scanner;
public class Quc35 {
    
      public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        x=s.nextInt();
       System.out.println(fun(x));
    }
      public static int fun(int x){
          
          if(x!=1){
              x=x*fun(x-1);
             
          }
          return x;
          
      }
    
}
