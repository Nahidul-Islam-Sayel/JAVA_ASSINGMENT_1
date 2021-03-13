
package quc.pkg11;

import java.util.Scanner;
public class Quc11 {

   
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x;
        x=s.nextInt();
        if((x%4==0&&x%100!=0)||x%400==0){
            System.out.println("This is a leep year");
        }
        else System.out.println("This is not leep year");
    }
    
}
