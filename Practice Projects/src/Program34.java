import java.util.Scanner;
public class Program34 
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
		System.out.println("Sort the Array");
		for(int i = 0; i < n; i++)    
		{    
			for(int j = i+1; j < n; j++)    
		    {    
				if(array[j] < array[i])    
		        {    
					int temp = array[i];    
		            array[i] = array[j];    
		            array[j] = temp;     
		        }     
		   }     
		}     
		System.out.println("Print the Sorted Array :");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Enter the Element to be Searched :");
		int search=sc.nextInt();
		int first=0;
		int last=(n-1);
		int mid=(first+last)/2;
		while (first<=last)
		{
			if ( array[mid] < search )
			{  
		        first = mid + 1;     
		    }
			else if ( array[mid] == search )
			{  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		    }
			else
			{  
		         last = mid - 1;  
		    }  
		    mid = (first + last)/2;  
		}  
		if ( first > last )
		{  
		      System.out.println("Element is not found!");  
		}  
	}
}