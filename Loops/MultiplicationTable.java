import java.util.*;
public class MultiplicationTable
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,i;
	    System.out.println("Enter value of n for Multiplication Table");
	    n= sc.nextInt();
	    for(i=1;i<=10;i++){
	        System.out.println(n + " x " + i + " = " + n * i);
	    }
	}
}
