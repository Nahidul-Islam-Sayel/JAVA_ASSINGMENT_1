
package quc34;

import java.util.Scanner;
public class Quc34 {
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        System.out.println(sum(x));
    }
    public static int sum(int x){
        
        if(x!=0){
            x=x+sum(x-1);
        }
  
        return x;
      
    }
}
    

