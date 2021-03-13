
package quc.pkg33;
import java.util.Scanner;
public class Quc33 {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n;
      n=s.nextInt();
    
    boolean f = false;
    for (int i = 2; i <= n/2; ++i) {

      
      if (checkPrime(i)) {

  
        if (checkPrime(n - i)) {
             System.out.printf("%d + %d = %d\n", n-i, i, n);
             f = true;
        }

      }
    }

    if (!f)
      System.out.println("not possible");
  }


  static boolean checkPrime(int num) {
    boolean isPrime = true;

    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }
}
 