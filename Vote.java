package assignments_26;
import java.util.*;
public class Vote {

	public static void main(String[] args) 
	{
		Scanner voter=new Scanner(System.in);
		int age;
		boolean isCitizen;
		System.out.println("Enter your Age ");
		age=voter.nextInt();
		System.out.println("Are you citizen?");
		isCitizen=voter.nextBoolean();
		if(age>=18 && isCitizen==true)
		{
			System.out.println("Person is eligible for Voting");
		}
		else
		{
			System.out.println("Person is NOT eligible for Voting");
		}
		

	}

}
