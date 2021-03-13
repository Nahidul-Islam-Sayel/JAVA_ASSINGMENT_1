
package quc.pkg49;

import java.util.Scanner;
public class Quc49 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,p;
        System.out.println("please Enter the coulm and row");
        n=s.nextInt();
        p=s.nextInt();
        int [][]a=new int[n][p];
        int [][]b=new int[n+10][p+10];
        for(int i=0; i<n; i++){
            for(int j=0; j<p; j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<p; ++j){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0; i<p; i++){
            for(int j=0; j<n; j++){
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
