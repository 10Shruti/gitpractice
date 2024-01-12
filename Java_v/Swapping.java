import java.util.*;

public class Swapping{
	public static void main(String[] args){
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st value : ");
		a=sc.nextInt();
		System.out.print("\nEnter 2st value : ");
		b=sc.nextInt();
		System.out.print("Values Before swapping " + a+ " and "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.print("\nValues after swapping " + a+ " and "+b);
	}
}