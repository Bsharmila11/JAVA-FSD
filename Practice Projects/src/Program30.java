import java.util.Stack;
import java.util.*;
class StackDemo 
{
		public Stack ss = new Stack();
		String push(String name) 
		{
			if(ss.size()<5) 
			{
				ss.push(name);
				return "Element pushed in stack succesfully";
			}
			else 
			{
				return "Stack is overflow";
			}
		}
		public String pop() 
		{
			if(ss.size()>0)
			{
				return (String)ss.pop();
			}
			else 
			{
				return "Stack is underflow";
			}
		}
		public int size() 
		{
			return ss.size();
		}
}
public class Program30 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		StackDemo ss = new StackDemo();
		String con="";
		String data;
		do {
			System.out.println("1: Push 2 : Pop 3 : Size");
			System.out.println("Enter your choice");
			int key = obj.nextInt();
			switch (key) {
			case 1:	System.out.println("Enter the data to push in stack");
			            data = obj.next();
						System.out.println(ss.push(data));
						break;
			case 2 : System.out.println("Pop the item from a stack");
			             System.out.println(ss.pop());
						break;
			case 3: System.out.println("Size of stack is "+ss.size());
						break;
			default:System.out.println("Wrong choice");
						break;
			}
			System.out.println("Do you want to continue?");
			con = obj.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You");
	}

}


