
package quc39;
import java.util.Scanner;
public class QUC39 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int oct=0,dec=0;
        int i=1;
        while(x!=0){
            dec+=(x%10)*i;
            x/=10;
            i*=2;
        }
        i=1;
        while(dec!=0){
            oct+=(dec%8)*i;
            dec/=8;
            i*=10;
        }
        System.out.println(oct);
    }
    
}
