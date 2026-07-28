import java.util.Scanner;
public class SwapNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping");
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
        sc.close();
    }
}
