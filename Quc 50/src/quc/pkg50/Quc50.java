
package quc.pkg50;

import java.util.Scanner;
public class Quc50 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String ss=s.nextLine();
      int v=0,c=0;
      for(int i=0; i<ss.length(); i++){
          if(ss.charAt(i)=='a'||ss.charAt(i)=='A'||ss.charAt(i)=='E'||ss.charAt(i)=='e'||ss.charAt(i)=='I'||ss.charAt(i)=='i'||ss.charAt(i)=='O'||ss.charAt(i)=='o'||ss.charAt(i)=='u'||ss.charAt(i)=='U'){
              v++;
          }
          else c++;
      }
      System.out.println("Number of vowel = "+v+"\n"+"Number of consonant = "+c);
      
    }
    
}
