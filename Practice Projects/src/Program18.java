import java.util.Scanner;
class MyExceptions extends Exception 
{
	public MyExceptions(String m)
	{
		
	}
}
class Program18
{
	public static void main(String args[]) throws Exception
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age :");
		age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new MyExceptions(" age<18 ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Not Eligible to Vote");
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Finally Block executes in whatever may be the case");
		}
		
	}
}
