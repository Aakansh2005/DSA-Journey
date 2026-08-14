import java.util.*;
public class PalindromeNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i,rev=0;
	    System.out.println("Enter value of n");
	    n=sc.nextInt();
	    int original=n;
	    while(n>0){
	        i=n%10;
	        rev= rev*10+i;
           n=n/10;
	    }
	    if(rev==original){
	     System.out.println("Number is Palindrome ");
	}
	else{
	    System.out.println("Number is NOT Palindrome ");
	}
}
}