import java.util.*;
public class Program01 
{
	public static void main(String args[])
	{
		int b,c;
		char a,d;
		float e;
		double f;
		long g;
		short h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Implict Type Casting");
		System.out.println("Enter a Character :");
		a=sc.next().charAt(0);
		b=a;
		e=a;
		f=a;
		g=a;
		System.out.println("Character to Int Conversion :"+b);
		System.out.println("Character to Float Conversion :"+e);
		System.out.println("Character to Double Conversion :"+f);
		System.out.println("\n");
		System.out.println("Explict Type Casting");
		System.out.println("Enter a Number :");
		c=sc.nextInt();
		d=(char)c;
		h=(short)c;
		System.out.println("Int to Character Conversion :"+d);
		System.out.println("Int to Short Conversion :"+h);
	}
}
