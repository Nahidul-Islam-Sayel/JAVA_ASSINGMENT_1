
package quc30;

import java.util.Scanner;
public class QUC30 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y;
        x=s.nextInt();
        y=s.nextInt();
        funtion(x,y);
    }
    public static void funtion(int n1,int n2){
       

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
