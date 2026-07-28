import java.util.Scanner;
public class simpleinterestcalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double p,r,t,simple_interest;
        System.out.println("Principle=");
         p = sc.nextDouble();
        System.out.println("Rate=");
         r = sc.nextDouble();
        System.out.println("Time=");
         t = sc.nextDouble();
        simple_interest= p*r*t /100;
        System.out.println("The simple_interest="+simple_interest);
        sc.close();
    }
}
