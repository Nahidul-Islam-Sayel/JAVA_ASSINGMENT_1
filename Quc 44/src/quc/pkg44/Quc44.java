
package quc.pkg44;

import java.util.Scanner;
public class Quc44 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        double y=0.0;
        System.out.println("Enter the size:");
        x=s.nextInt();
         System.out.println("Enter Array element:");
        int []a=new int[x];
        for(int i=0; i<x; i++){
            a[i]=s.nextInt();
            y+=a[i];
        }
        y/=x;
        double z=0.0;
        for(int i=0; i<x; i++){
            z+=Math.pow(a[i]-y,2);
        }
        System.out.println(z/x);
    }
    
}
