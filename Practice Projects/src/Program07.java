import java.util.*;
class Program07
{	
	public static void main(String args[])
	{
		System.out.println("Hashed Map");
		Map<String,Integer> hm1=new HashMap<>();
		Map<String,Integer> hm2=new HashMap<>();
		hm1.put("a",new Integer(100));
		hm1.put("b",new Integer(200));
		hm1.put("c",new Integer(300));
		
		hm2.put("a",100);
		hm2.put("b",200);
		hm2.put("c",300);
		for (Map.Entry<String,Integer> me: hm1.entrySet())
		{
			System.out.println(me.getKey() + ":" + me.getValue());
		}
		System.out.println("Before Changing Elements :"+hm2);
		hm2.put("a",1000);
		System.out.println("After Changing Elements :"+hm2);
		
		System.out.println("Before Changing Elements :"+hm1);
		hm1.remove("a");
		System.out.println("After Changing Elements :"+hm1);
		System.out.println("\n");
		System.out.println("LinkedHashed Map");
		Map<String,Integer> lhm=new LinkedHashMap<>();
		lhm.put("a",new Integer(100));
		lhm.put("b",new Integer(200));
		lhm.put("c",new Integer(300));
		lhm.put("d",new Integer(400));
		for (Map.Entry<String,Integer> e: lhm.entrySet())
		{
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		System.out.println("\n");
		System.out.println("Tree Map");
		Map<String,Integer> t=new TreeMap<>();
		t.put("a",new Integer(100));
		t.put("b",new Integer(200));
		t.put("c",new Integer(300));
		t.put("d",new Integer(400));
		for (Map.Entry<String,Integer> f: t.entrySet())
		{
			System.out.println(f.getKey() + ":" + f.getValue());
		}
	
	
	}
}
