import java.util.*;
public class PerfectNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i=1,sum=0;
	    System.out.println("Enter value of n");
	    n=sc.nextInt();
	    int orignal= n;
	    while(i<n){
	        if(n%i==0){
	            sum=sum+i;
	            }
	            i++;
	    }
	    if(orignal==sum){
	    System.out.println("It is a Perfect number ");
	    }
	    else{
	         System.out.println("It is NOT a Perfect number ");
	    }
}
}
