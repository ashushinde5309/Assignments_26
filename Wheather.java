package assignments_26;
import java.util.*;
public class Wheather 
{
	public static void main(String[] args) 
	{
		double t;
		boolean israin;
		Scanner temp=new Scanner(System.in);
		System.out.println("Enter Temperature");
		t=temp.nextDouble();
		System.out.println("Is there is a rain outside");
		israin=temp.nextBoolean();
		if(t>=20 && t<=30 && !israin)
		{
			System.out.println("It is safe to go outside");
		}
		else
		{
			System.out.println("It is not safe go to outside");
		}
	}

}
