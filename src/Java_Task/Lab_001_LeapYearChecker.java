package Java_Task;

import java.util.Scanner;

public class Lab_001_LeapYearChecker {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 !=0)||(year % 400 ==0))
        {
            System.out.println(year + " is a Leap Year.");
        }
        else
        {
            System.out.println(year + " is NOT a Leap Year.");
        }

    }

}
