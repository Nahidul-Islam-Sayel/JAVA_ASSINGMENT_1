
package quc.pkg41;

import java.util.Scanner;
public class QUC41 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y;
        System.out.println("Enter base && power");
        x=s.nextInt();
        y=s.nextInt();
        
       System.out.println(rev(x,y));
     
    }
    public static int rev(int x,int y){
        if(y==0)return 1;
        return x*rev(x,y-1);
    }
    
}
