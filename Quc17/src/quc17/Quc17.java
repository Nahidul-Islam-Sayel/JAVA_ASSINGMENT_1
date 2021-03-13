
package quc17;

import java.util.Scanner;
public class Quc17 {

    
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int []a=new int[1000];
       a[0]=0;
       a[1]=1;
       System.out.print(a[0]+" "+a[1]);
       for(int i=2; i<=100; i++){
           a[i]=a[i-1]+a[i-2];
           System.out.print(" "+(a[i]));
           
    }
    
}
}
