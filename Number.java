package assignments_26;
import java.util.*;
public class Number 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter number ");
		n=obj.nextInt();
		if(!(n>=10 && n<=20))
		{
			System.out.println("Number is not between range 10 to 20(Inclusive)");
		}
		else
		{
			System.out.println("Number is between 10 to 20");
		}

	}

}
