import java.util.*;

public class Swap{
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st value : ");
		a=sc.nextInt();
		System.out.print("\nEnter 2st value : ");
		b=sc.nextInt();
		System.out.print("Values Before swapping " + a+ " and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("\nValues after swapping " + a+ " and "+b);
	}
}