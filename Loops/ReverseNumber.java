import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i,rev=0;
	    System.out.println("Enter value of n");
	    n=sc.nextInt();
	    
	    while(n>0){
	        i=n%10;
	        rev= rev*10+i;
           n=n/10;
	    }
	     System.out.println("Reverse order is "+rev);
	}
}