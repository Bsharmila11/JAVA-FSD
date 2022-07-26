import java.util.*;

public class Program06
{
	public static void main(String args[])
	{
		System.out.println("Array List");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1;i<=5;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		a.remove(3);
		System.out.println("After Deletion");
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i) +" ");
		}
		System.out.println("\n");
		System.out.println("Linked List");
		LinkedList<Integer> b = new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
		{
			b.add(i);
		}
		System.out.println(b);
		b.remove(3);
		System.out.println("After Deletion");
		System.out.println(b);
		for(int i=0;i<b.size();i++)
		{
			System.out.print(b.get(i) +" ");
		}
		
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<=5;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		v.remove(3);
		System.out.println("After Deletion");
		System.out.println(v);
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i) +" ");
		}
		
		System.out.println("\n");
		System.out.println("Stack");
		Stack<Integer> s = new Stack<Integer>();
		for(int i=1;i<=5;i++)
		{
			s.push(i);
		}
		System.out.println(s);
		s.pop();
		System.out.println("After Deletion");
		System.out.println(s);
		for(int i=0;i<s.size();i++)
		{
			System.out.print(v.get(i) +" ");
		}
		
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=1;i<=5;i++)
		{
			h.add(i);
		}
		System.out.println(h);
		
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		for(int i=1;i<=5;i++)
		{
			lh.add(i);
		}
		System.out.println(lh);
	}
}