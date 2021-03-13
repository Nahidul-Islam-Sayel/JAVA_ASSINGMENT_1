
package quc.pkg56;

import java.util.Scanner;
public class Quc56 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []a=new int[10];
        System.out.println("Please Enter same value size 10");
        for(int i=0; i<10; i++){
            a[i]=s.nextInt();
        }
         for(int i=0; i<10; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
