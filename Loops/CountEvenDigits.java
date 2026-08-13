import java.util.*;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,count = 0;
        System.out.println("Enter value of n");
        n = sc.nextInt();

        while (n>0) {
             i=n%10;
            if(i%2==0){
                count++;
            }
        n=n/10;
    }
    System.out.println(count);
}
}