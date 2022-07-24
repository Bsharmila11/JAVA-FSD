import java.util.*;
public class Program10 
{
	public static void main(String args[])
	{
		int a[]={10,17,67};
		int b[]=new int[10];
		int c[][]={{10,20},{30,40}};
		int d[][]=new int[10][10];
		int m,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Accessing the Element by using the Index");
		System.out.println(a[2]); 
		System.out.println("\n");
		System.out.println("Printing the Elements of Array 'a' :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n");
		System.out.println("Enter the size of Array 'b' :");
		n=sc.nextInt();
		System.out.println("\n");
		System.out.println("Enter the elements of Array 'b' :");
		for(int i =0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Printing the Elements of Array 'b' :");
		for(int i =0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("\n");
		System.out.println("Accessing the Element by using the Index");
		System.out.println(c[0][1]); 
		System.out.println("\n");
		System.out.println("Printing the Elements of Array 'c' :");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		System.out.println("\n");
		System.out.println("Enter the size of Array 'd' :");
		m=sc.nextInt();
		k=sc.nextInt();
		System.out.println("\n");
		System.out.println("Enter the elements of Array 'd' :");
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<k;j++)
			{
				d[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing the Elements of Array 'd' :");
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.println(d[i][j]);
			}
		}
				
	}
}
