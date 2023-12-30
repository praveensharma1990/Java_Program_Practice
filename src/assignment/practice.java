package src.assignment;
import java.io.*;
import java.util.*;

public class practice
{
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("first string");
        String s1 = sc.nextLine();
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("Second string");
        sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Second Number");
        int b = sc.nextInt();
       System.out.println("Third string");
       sc.nextLine();
       String s3 = sc.nextLine();
       System.out.println("Third Number");
        int c = sc.nextInt();
        System.out.println("===============================");
        System.out.printf("%s,        0%d%n", s1, a);
        System.out.printf("%s,        0%d%n", s2, b);
        System.out.printf("%s,        0%d%n", s3, c);
        System.out.println("================================");
    }

}

