
package quc.pkg40;
import java.util.Scanner;

public class QUC40 {
    public static void main(String[] args) {
            String ss;
            Scanner s=new Scanner(System.in);
            ss=s.nextLine();
           System.out.println(show(ss));
            
            
    }
    public static String show(String ss){
        if (ss.isEmpty())
             return ss;
        return show(ss.substring(1)) + ss.charAt(0);
    }
    
}
