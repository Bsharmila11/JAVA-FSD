import java.util.Scanner;
public class Program24 
{
	public  static void main(String args[])
	{
		int array []= new int [10];  
		Scanner sc=new Scanner(System.in);
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
		System.out.println("Print the Sorted Array :");
		int temp = 0;  
        for(int i=0; i < m; i++)
        {  
                for(int j=1; j < (m-i); j++)
                {  
                         if(array[j-1] > array[j])
                         {  
                                temp = array[j-1];  
                                array[j-1] = array[j];  
                                array[j] = temp;  
                        }  
                         
                }  
        }
        for(int i=0;i<m;i++)
		{
			System.out.print(array[i]+" ");
		}
        System.out.println("\n");
        System.out.println("Printing the 4 th Smallest Element :"+array[3]);
        
	}
}
