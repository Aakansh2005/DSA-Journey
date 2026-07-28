import java.util.Scanner;
public class totalamount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original price");
        double price = sc.nextDouble();
        System.out.println("Enter the discount percentage");
        double discount = sc.nextDouble();

        double discountamount =  price * discount / 100;
        double finalprice = price - discountamount;

        System.out.println("Discount Amount = "+ discountamount);
        System.out.println("Final Price="+ finalprice);
        sc.close();
    }
}