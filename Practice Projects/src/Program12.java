import java.util.*;
public class Program12
{
	public static void main(String args[])
	{
		String search;
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		a.add("meka.naren@gmail.com");
        a.add("venkata.raghu@gmail.com");
        a.add("sri.vineela@gmail.com");
        a.add("renukesh@gmail.com");
		System.out.println("Enter the email Id that have to be searched in the ArrayList");
		search=sc.next();
		if(a.contains(search))
		{
			System.out.println("The email id entered by user " + search + " is found in the ArrayList");
		}
		else
		{
			System.out.println("The email id entered by user " + search + " is not found in the ArrayList");
		}
	}
}