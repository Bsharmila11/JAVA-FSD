public class Program13a implements Runnable
{
	 public void run()
	 {
	  		System.out.println("Runnaable Thread");
	 }
	 public static void main( String args[] )
	 {
	  		Program13a mt = new  Program13a();
	  		Thread t=new Thread(mt);
	  		System.out.println(mt);
	  		t.setPriority(2);
	  		System.out.println(mt);
	  		t.start();
	 }
}

