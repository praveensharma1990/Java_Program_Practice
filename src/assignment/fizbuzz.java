package src.assignment;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class fizbuzz {
  Scanner FZ= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("plz enter the value till 100");
        for(int i=1;i<=100;i++)
        {
           if(i%3==0 && i%5==0 )
           {
               System.out.println("Fizz Buzz");

           } else if (i%3==0) {

               System.out.println("Fizz");

           } else if (i%5==0) {
               System.out.println("Buzz");

           }
           else
               System.out.println(i);
        }
        System.out.println("end of the program");
    }
}
