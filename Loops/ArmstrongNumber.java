import java.util.*;
public class ArmstrongNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i,sum=0;
	    System.out.println("Enter value of n");
	    n=sc.nextInt();
	    int original=n;
	    while(n>0){
	        i=n%10;
	        sum=sum+ i*i*i;
	        n=n/10;
	    }
	    if(original==sum){
	    System.out.println("Number is Armstrong");
	    }
	    else{
	        System.out.println("Aumber is NOT armstrong");
	    }
}
}