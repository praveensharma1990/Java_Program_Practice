package src.assignment;
import java.util.Scanner;
public class leapyear
{
    public static void main(String[] args) {
        System.out.println("plz enter the year that you want to check");
     Scanner leap = new Scanner(System.in);
     int year = leap.nextInt();
     if((year %4 ==0) && (year %100 !=0)||(year%400==0))
     {
         System.out.println( year+ " is leap year");
     }
     else
         System.out.println(year+ " is not a leap year");


    }

}
