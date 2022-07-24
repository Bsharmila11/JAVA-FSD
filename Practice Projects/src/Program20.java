abstract class Display
{
	abstract void display();
}
public class Program20 extends Display
{
	public void display()
	{
		System.out.println("This is an abstract Method");
	}
	void area(double r)
	{
		System.out.println("Area of the Square :" +3.14*r*r);
	}
	void area(int b,int h)
	{
		System.out.println("Area of the Triangle :" +0.5*b*h);
	}
	public static void main(String args[])
	{
		Program20 p=new Program20();
		p.area(2);
		p.area(2,4);
		p.display();
		
	}
}
