import java.util.*;
public class Program33 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int array [] = new int[20];
		System.out.println("Enter the number of elements in the Array :");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Print the Array Elements :");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("Enter the Element to be Searched :");
		int search=sc.nextInt();
		for (int i = 0; i < n; i++)  
	    {  
	        if (array[i] == search)  
	        	System.out.println("Element Found at Index : "+i); 
	        	
	    }
	}  
				
}

