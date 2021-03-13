
package quc.pkg55;

public class Quc55 {

    public static void main(String[] args) {
       String s="MY Name is Nahid";
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)==' ')continue;
           else System.out.print(s.charAt(i));
       }
    }
    
}
