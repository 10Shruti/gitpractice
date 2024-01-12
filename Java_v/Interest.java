import java.util.*;

public class Interest{
	public static void main(String[] args){
		int p,t,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal amount  : ");
		p=sc.nextInt();
		System.out.print("\nEnter time : ");
		t=sc.nextInt();
		System.out.print("Enter Rate : ");
		r=sc.nextInt();
				
		int s=(p*t*r)/100;

		System.out.print("\nSimple Interest : "+s);
	}
}