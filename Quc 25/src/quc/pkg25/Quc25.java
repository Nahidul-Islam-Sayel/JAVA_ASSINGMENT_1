
package quc.pkg25;

import java.util.Scanner;
public class Quc25 {

 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,l=0;
        num=s.nextInt();
        if(num==1||num==0){
             System.out.println("Not prime number");
                l=1;
        }
        
        for(int i=2; i<num; i++){
            if(num%i==0&&num!=2){
                System.out.println("Not prime number");
                l=1;
                break;
        }
    }
        if(l==0) System.out.println("prime number");
        
    
}
}
