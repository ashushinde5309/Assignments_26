package assignments_26;
import java.util.*;
public class GreaterNo
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int c;
		System.out.println("Enter 3 numbers ");
		n1=obj.nextInt();
		n2=obj.nextInt();
		n3=obj.nextInt();
		c=(n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println("Greatest no is "+c);
		
		
	}

}
