import java.util.*;
class MyException extends Exception
{
	public MyException(String m)
	{
		
	}
}
class Program16
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
				throw new MyException(" age<18 ");
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
