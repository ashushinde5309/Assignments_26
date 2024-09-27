package assignments_26;
import java.util.*;
public class ExamGrade
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		int s1;
		int s2;
		int s3;
		double avg;
		System.out.println("Enter 3 subject Marks");
		s1=obj.nextInt();
		s2=obj.nextInt();
		s3=obj.nextInt();
		avg=(s1+s2+s3)/3;
		
		if(avg>=60 && s1>=40 && s2>=40 && s3>=40)
		{
			System.out.println("Student Pass");
		}
		else
		{
			System.out.println("student Fail");
		}
	}

}
