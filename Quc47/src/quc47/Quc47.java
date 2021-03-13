
package quc47;
import java.util.Scanner;
public class Quc47 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       int r,c;
       System.out.println("Please Enter collum and row size");
       r=s.nextInt();
       c=s.nextInt();
       int [][]a=new int[r][c];
       int [][]b=new int[r][c];
             System.out.println("Please Enter First array");
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               a[i][j]=s.nextInt();
           }
       }
       System.out.println("Please Enter Second array");
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               b[i][j]=s.nextInt();
           }
       }
       show(a,b,r,c);
     
    }
    public static void show(int [][]a,int [][]b,int r,int c){
            System.out.println("Answer");
       for(int i=0; i<r; i++){
           for(int j=0; j<c; j++){
               System.out.print(a[i][j]*b[i][j]+" ");
           }
           System.out.println();
    }
    }
    
}
