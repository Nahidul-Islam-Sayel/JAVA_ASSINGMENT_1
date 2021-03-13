
package quc.pkg26;

import java.util.Scanner;
public class Quc26 {
    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int x,y,l=0;
       x=s.nextInt();
       y=s.nextInt();
       for(int i=x; i<=y; i++){
          l=0;
           if(i==1||i==0){
                continue;
           }
           for(int j=2; j<i; j++){
               if(i%j==0&&i!=2){
                  
                   l=1;
                   break;
               }
           }
           if(l==0)System.out.println(i);
       }
       
    }
    
}
