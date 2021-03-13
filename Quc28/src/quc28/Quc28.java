
package quc28;
import java.util.Scanner;
public class Quc28 {

    
    public static void main(String[] args) {
       int n1, n2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 2 number ::");
      n1 = sc.nextInt();
   
      n2 = sc.nextInt();

      for (int i = n1; i<=n2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(i);
         }
}
   }
}

