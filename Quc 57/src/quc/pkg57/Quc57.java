package quc.pkg57;


public class Quc57 {

   public static void main(String[] args) {
        
        String s = "1999-10-19";
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'){
              System.out.print(s.charAt(i));
          }
          else if(s.charAt(i)=='-'){
              System.out.print(" ");
          }
              
         }
    }
}
