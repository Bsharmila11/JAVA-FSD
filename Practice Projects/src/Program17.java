import java.util.Scanner;
class Exceptions extends Exception
{
	public Exceptions(String m)
	{
		
	}
}
class Program17
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new Exceptions(" age<18 ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Not Eligible to Vote");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block executes in whatever may be the case");
		}
		
	}
}
