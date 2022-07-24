import java.util.regex.*;
import java.util.*;
class Program11
{
	public static void main(String[] args) 
	{
		
		String pattern = "[A-M]+";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s = sc.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		while (m.find())
		{
      			System.out.println(s.substring( m.start(), m.end() ) );
		}
	}
}