public class Program09
{
	public static void main(String args[])
	{
		String a="Welcome to Java Programming";
		String b=new String("Welcome to Tutorial");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n");
		System.out.println(a.length());
		System.out.println("\n");
		System.out.println(a.charAt(2));
		System.out.println("\n");
		System.out.println(a.toUpperCase());
		System.out.println("\n");
		System.out.println(a.toLowerCase());
		System.out.println("\n");
		System.out.println(a.compareTo(b));
		System.out.println("\n");
		System.out.println(a.substring(3));
		System.out.println("\n");
		System.out.println(a.concat(b));
		System.out.println("\n");
		System.out.println(a.endsWith("mming"));
		System.out.println("\n");
		System.out.println(a.startsWith("mming"));
		System.out.println("\n");
		System.out.println(a.replace("Programming","Class"));
		System.out.println("\n");
		System.out.println(a.equals(b));
		System.out.println("\n");
		System.out.println(a.isEmpty());
		System.out.println("\n");
		System.out.println("Creating String Buffer");
		StringBuffer c=new StringBuffer("Happy Learning");
		System.out.println(c);
		System.out.println(c.append("Enjoy the lecture"));
		System.out.println(c.replace(0,1,"HA"));
		System.out.println(c.delete(0,1));
		System.out.println("\n");
		System.out.println("Creating String Buffer");
		StringBuilder d=new StringBuilder("Strings Demo");
		System.out.println(d);
		System.out.println(d.append(" Program"));
		System.out.println(d.reverse());
		System.out.println(d.delete(0,1));
		System.out.println("\n");
		String str="Learning";
		System.out.println("Conversion of Strings to StringBuffer");
		StringBuffer e = new StringBuffer(str); 
        		e.reverse();
        		System.out.println(e); 
        System.out.println("\n");
		String string="Hello";
		System.out.println("Conversion of Strings to StringBuilder");
		StringBuilder f = new StringBuilder(string); 
        		f.append("World");
        		System.out.println(f); 
		
	}
}
