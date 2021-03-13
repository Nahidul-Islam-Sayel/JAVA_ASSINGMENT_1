
package quc.pkg61;

import java.util.Scanner;
public class Quc61 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    
        int a[]=new int[10];
        System.out.println("Please enter 10 value");
        for(int i=0; i<10; i++){
            a[i]=s.nextInt();
        }
        System.out.println("Please enter whos number you found");
        int l=1;
        int x=s.nextInt();
           for(int i=0; i<10; i++){
            if(a[i]==x){
                System.out.println("YES number is found");
                l=0;
            }
        }
           if(l==1){
               System.out.println("The number is not found");
           }
        
    }
    
}
