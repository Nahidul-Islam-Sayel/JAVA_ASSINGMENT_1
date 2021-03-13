package quc.pkg53;

import java.util.Scanner;
public class Quc53 {

   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Please enter 1st H M S");
       int h1,m1,s1,f2;
       h1=s.nextInt();
       m1=s.nextInt();
       s1=s.nextInt();
       int f=(h1*3600)+(m1*60)+s1;
       System.out.println("Please enter 2nd H M S");
       int h2,m2,s2;
       h2=s.nextInt();
       m2=s.nextInt();
       s2=s.nextInt();
       if(h1>h2){
            f2=(h2+24*3600)+(m2*60)+s2;
       }
       else{
           f2=(h2*3600)+(m2*60)+s2;
       }
       int ans=Math.abs(f2-f);
       
       int hh=ans/3600;
       int ph=hh;
       if(hh>12)ph-=12;
       System.out.println("H = "+ph);
       ans-=hh*3600;
       int mm=ans/60;
       System.out.println("M = "+mm);
       ans-=mm*60;
    
        System.out.println("S = "+ans);
       
        
    }
    
}
