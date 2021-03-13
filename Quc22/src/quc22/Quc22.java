
package quc22;

import java.util.Scanner;
public class Quc22 {

  
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int reverse=0;
        while(x!=0){
          int p=x%10;
          reverse=(reverse*10)+p;
          x/=10;
        }
        System.out.println(reverse);
    }
    
}
