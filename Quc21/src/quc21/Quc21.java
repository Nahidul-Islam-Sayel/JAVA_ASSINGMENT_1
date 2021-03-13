
package quc21;
import java.util.Scanner;
public class Quc21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y=0;
        x=s.nextInt();
        while(x!=0){
            x/=10;
            y++;
        }
        System.out.println(y);
    }
    
}
