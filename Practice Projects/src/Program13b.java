public class Program13b extends Thread
{
 	public void run()
 	{
  		System.out.println("Thread started Running..");
}
 	public static void main( String args[] )
 	{
  		Program13b mt = new  Program13b();
  		System.out.println(mt);
  		mt.setPriority(2);
  		System.out.println(mt);
  		mt.start();
 	}
}
