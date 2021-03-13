
package quc.pkg54;
import java.util.Scanner;
public class Quc54 {
     
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int x=s.nextInt();
      for(int i=1; i<=x; i++){
          for(int j=0; j<i; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
    
}
