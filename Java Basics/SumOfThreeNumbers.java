//Write a program to input three numbers and find their sum.

import java.util.Scanner;
public class SumOfThreeNumbers{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        

        System.out.println("Enter the first number=");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

         int sum = a + b + c;

        System.out.println("Sum = " + sum);


        sc.close();
    }
}