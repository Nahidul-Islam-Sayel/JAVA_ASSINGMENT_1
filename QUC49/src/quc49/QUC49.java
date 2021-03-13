
package quc49;

import java.util.Scanner;
public class QUC49 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String ss;
       ss=s.nextLine();
       System.out.println("Enter which word Frequency you know");
       char a;
       a=s.next().charAt(0);
       int l=0;
       for(int i=0; i<ss.length(); i++){
           if(a==ss.charAt(i))l++;
       }
       System.out.println(l);
       
    }
    
}
