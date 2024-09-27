package assignments_26;

import java.util.Scanner;

public class JobAppl {

	public static void main(String[] args) 
	{
		Scanner job=new Scanner(System.in);
		boolean bachDeg;
		boolean equExp;
		boolean cleCrimrec;
		System.out.println("Do you Possess Bachlors Degree");
		bachDeg=job.nextBoolean();
		System.out.println("Do you Have Equivalent Experiance");
		equExp=job.nextBoolean();
		System.out.println("Do you have clean Criminal Record");
		cleCrimrec=job.nextBoolean();
		if(bachDeg || equExp && cleCrimrec)
		{
			System.out.println("You are Eligible for job");
		}	
		else
		{
			System.out.println("You are NOT Eligible for job");
		}

	}

}
