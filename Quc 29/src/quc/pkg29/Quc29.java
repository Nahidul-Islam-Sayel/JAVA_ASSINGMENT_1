
package quc.pkg29;
import java.util.Scanner;
public class Quc29 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int x,y;
       x=s.nextInt();
       y=s.nextInt();
       funtion(x,y);
    }
    public static void funtion(int x,int y){
        int l=0;
        for(int i=x; i<=y; i++){
            l=0;
            if(i==0||i==1)continue;
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
