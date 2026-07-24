//KM to Miles conversion using scanner

import java.util.Scanner;
public class kmconversion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input total Kilometers=");
        double km = sc.nextDouble();

        double miles = km * 0.62137;
        System.out.printf("Number of Miles are = %.2f", miles);
        sc.close();

    }
}
