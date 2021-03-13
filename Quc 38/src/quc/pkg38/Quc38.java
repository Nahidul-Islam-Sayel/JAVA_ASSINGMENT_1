
package quc.pkg38;
import java.util.Scanner;
public class Quc38 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int octal=0,i=1;
        while(x!=0){
            octal+=(x%8)*i;
            x/=8;
            i*=10;
        }
        System.out.println(octal);
    }
    
}
