
package quc.pkg28;

import java.util.Scanner;
public class Quc28 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int n,a,c = 0;
       n=s.nextInt();
        System.out.println("Enter the size");
        int size=s.nextInt();
        int temp= n;  
        while(n!=0) {
            int s1=size;
             a=n%10;  
           n=n/10; 
           int pp=a;
           while(s1!=1){
               a*=pp;
               s1--;
           }
           //System.out.println(a);
        c+=a;  
     }  
     if(temp==c)  
             System.out.println("Armstrong number");   
    else  
        System.out.println("Not a armstrong number");   
   }  
}
    


