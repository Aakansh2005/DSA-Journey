
import java.util.*;
public class SumOfEvenNumbers{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i,sum=0;
	    System.out.println("Enter n");
	    n= sc.nextInt();
	    for(i=1;i<=n;i++){
	        if(i%2==0){
	     sum=sum+i;
	        }
	    }
	    System.out.println(sum);
	}
}