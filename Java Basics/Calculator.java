import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a= sc.nextDouble();
        System.out.println("Enter the second number");
        double b= sc.nextDouble();

        System.out.println("\n Choose an operation");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: x (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");

        System.out.println("Enter Your Choice (1-5)");
        int choice= sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result="+ (a+b));
            break;
            case 2:System.out.println("Result="+ (a-b));
                break;
            case 3:System.out.println("Result="+ (a*b));
                break;
            case 4:System.out.println("Result="+ (a/b));
                break;
            case 5:System.out.println("Result="+ (a%b));
                break;
        
            default:System.out.println("Invalid Input");
                break;
        }
    }
}