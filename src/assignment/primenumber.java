package src.assignment;
import java.util.Scanner;
public class primenumber
{
    public static void main(String[] args)
    {
        Scanner pm = new Scanner(System.in);
        System.out.println("Please Enter the number to check");
        int number = pm.nextInt();
        boolean flag = false;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (flag==false)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}