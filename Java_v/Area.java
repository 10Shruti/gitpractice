import java.util.*;
public class Area{
	public static void main(String[] args){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Radius value : ");
		int r=ip.nextInt();
		double Area=3.14*r*r;
		System.out.println("\nArea of Circle is : "+ Area);
	}
}