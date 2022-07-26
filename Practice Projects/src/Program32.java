import java.util.*;
public class Program32
{
    public int[] lis(int[] X)
    {        
        int n = X.length - 1;
        int[] M = new int[n + 1];  
        int[] P = new int[n + 1]; 
        int L = 0;
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
            for (int pos = L ; pos >= 1; pos--)
            {
                if (X[M[pos]] < X[i])
                {
                    j = pos;
                    break;
                }
            }            
            P[i] = M[j];
            if (j == L || X[i] < X[M[j + 1]])
            {
                M[j + 1] = i;
                L = Math.max(L,j + 1);
            }
        }
        int[] result = new int[L];
        int pos = M[L];
        for (int i = L - 1; i >= 0; i--)
        {
            result[i] = X[pos];
            pos = P[pos];
        }
        return result;             
    }
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements to be in the Sequence :");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" Elements");
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        Program32 obj = new Program32(); 
        int[] result = obj.lis(arr);       
        System.out.print("\nThe Longest Increasing Subsequence is : ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println("\n");
        System.out.println("\nThe length of the Longest Increasing Subsequence :"+result.length);
        
    }
}
