
package quc.pkg17;

import java.util.Scanner;
public class Quc18 {

    
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
        for(int i=c; ;i++){
            if(i%c==0&&i%d==0){
                System.out.println(i);
                break;
            }
        }
        
        
    }
    
}
