import java.util.*;
public class Program23 
{
	public  static void main(String args[])
	{
		int array []= new int [5];  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rotations : ");
		int n=sc.nextInt();
		System.out.println("Enter the Size of the Array : ");
		int m=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<m;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Print the Original Array :");
		for(int i=0;i<m;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		for(int i = 0; i <n; i++)
		{    
			int j, last;    
			last = array[array.length-1];    
			for(j = array.length-1; j > 0; j--)
			{           
				array[j] = array[j-1];    
			}    
			array[0] = last;    
		}       
	        
		System.out.println("Print the Array after Rotation :");
		for(int i=0;i<m;i++)
		{
			System.out.print(array[i]+" ");
		}    
	}
}
