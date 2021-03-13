
package quc.pkg19;

import java.util.Scanner;
public class Quc19 {

    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int x,y,c,d;
        x=s.nextInt();
        y=s.nextInt();
        if(x>=y){
            c=x;
            d=y;
        }
        else{
            c=y;
            d=x;
        }
        for(int i=d;i>=1 ;i--){
            if(c%i==0&&d%i==0){
                System.out.println(i);
                break;
            }
        }
        
    }
    
}
