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
		
	}
}
