
package quc.pkg43;

import java.util.Scanner;
public class Quc43 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the size");
       int x=s.nextInt();
       int[]a=new int[10];
       System.out.println("Enter the Element");
       int mx=-100000;
       for(int i=0; i<x; i++){
           a[i]=s.nextInt();
           if(mx<a[i]){
               mx=a[i];
           }
       }
       System.out.println(mx);
       
    }
    
}
