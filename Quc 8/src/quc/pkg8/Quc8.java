
package quc.pkg8;

import java.util.Scanner;
public class Quc8 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char c;
        c= s.next().charAt(0);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowal");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}
