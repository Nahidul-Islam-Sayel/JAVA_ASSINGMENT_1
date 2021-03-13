
package quc23;

import java.util.Scanner;
public class Quc23 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,p,q;
        System.out.println("Enter base number: ");
        x=s.nextInt();
        p=x;
        System.out.println("Enter Power number: ");
        y=s.nextInt();
        q=y;
        int ans = x;
       while(true){
           if(y==1)break;
             y--;
           ans*=x;
          
           System.out.println(ans);
       }
        System.out.println(p+"^"+q+" = "+ans);
    }
    
}
