
package quc15;

import java.util.Scanner;
public class Quc15 {

   
    public static void main(String[] args) {
        int x,y=1;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        for(int i=1; i<=x; i++){
            y*=i;
        }
        System.out.println(y);
    }
    
}
