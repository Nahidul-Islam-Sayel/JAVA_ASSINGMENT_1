
package quc.pkg31;

import java.util.Scanner;
public class Quc31 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        for(int i=1; i<=x; i++){
            if(x%i==0){
                System.out.println(i);
            }
        }
        
    }
    
}
