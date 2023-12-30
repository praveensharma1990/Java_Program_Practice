package src.assignment;

import java.util.Scanner;

public class Formatedoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i=0;
        while ( i<3) {
            String s1 = sc.next();
            int x = sc.nextInt();
            i++;

            System.out.println("================================");
            System.out.printf("%-15s%03d %n", s1, x);
            System.out.println("================================");

        }
    }
}
