package quc.pkg42;
import java.util.Scanner;
public class Quc42 {
    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int sum=0;
       System.out.println("Enter The size");
       int p=s.nextInt();
       int []a=new int[10];
       System.out.println("Enter The Element");
       for(int i=0; i<p; i++){
           a[i]=s.nextInt();
           sum+=a[i];
       }
       System.out.println(sum/p);
    }
    
}
