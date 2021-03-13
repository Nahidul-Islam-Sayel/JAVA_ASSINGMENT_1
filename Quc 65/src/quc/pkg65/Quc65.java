package quc.pkg65;
import java.util.Scanner;
public class Quc65 {   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
    
       System.out.println("Please Enter First Date  month  Year");
       int day1,month1,year1;
       day1=s.nextInt();
       month1=s.nextInt();
       year1=s.nextInt();
          System.out.println("Please Enter 2nd Date month Year");
       int day2,month2,year2;
       day2=s.nextInt();
       month2=s.nextInt();
       year2=s.nextInt();
       if(day2<day1){
           day2+=30;
           month2--;
           
       }
       if(month2<month1){
           month2+=12;
           year2--;
       }
    System.out.println("Year = "+(year2-year1));
     System.out.println("Month = "+(month2-month1));
     System.out.println("Day = "+(day2-day1));
       
    }
    
}
