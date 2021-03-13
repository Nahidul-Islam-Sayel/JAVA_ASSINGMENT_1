
package quc.pkg59;

import java.util.Scanner;
public class Quc59 {

 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []a=new int[10];
        int []b=new int[10];
        int []c=new int[20];
        System.out.println("Please Enter first array  size 10");
        for(int i=0; i<10; i++){
            a[i]=s.nextInt();
            c[i]=a[i];
        }
           System.out.println("Please Enter 2nd array  size 10");
           int j=10;
        for(int i=0; i<10; i++){
            b[i]=s.nextInt();
            c[j]=b[i];
            j++;
        }
        for(int i=0; i<20; i++){
            System.out.print(c[i]+" ");
        }
        
        
    }
    
}
