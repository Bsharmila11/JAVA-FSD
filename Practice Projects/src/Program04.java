import java.util.*;
public class Program04 {
	int c,d;
	int addition(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	int addition(int a,int b,int c)
	{
		int sum=0;
		sum=a+b+c;
		return sum;
	}
	public static void main(String args[])
	{
		int x,y,z,m,n,result1,result2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Numbers to be Added");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		Program04 m1=new Program04();
		result1=m1.addition(x,y,z);
		System.out.println("After Addition :"+result1);
		System.out.println("\n");
		System.out.println("Enter two Numbers to be Added");
		m=sc.nextInt();
		n=sc.nextInt();
		result2=m1.addition(m,n);
		System.out.println("After Addition :"+result2);
	}
}
