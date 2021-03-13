
package quc.pkg37;
import java.util.Scanner;
public class Quc37 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x;
        x=scan.nextInt();
        int num=x;
        int ans=0,rem,base=1;
        while(x!=0){
             rem=x%10;
            x/=10;
            ans=ans+(rem*base);
            base*=2;
        }
        System.out.println(ans);
        
    }
    
}
