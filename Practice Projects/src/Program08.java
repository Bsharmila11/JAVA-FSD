class OuterClass
{
	void display1()
	{
		int x=1206;
		System.out.println("Outer Class Method");
		class InnerClass
		{
			void display2()
			{
				System.out.println("Inner class Method");
				System.out.println(x);
			}
		}
		InnerClass i=new InnerClass();
		i.display2();

	}
}
class Program08
{
	public static void main(String args[])
	{
		OuterClass o = new OuterClass();
		o.display1(); 	
	}
}
