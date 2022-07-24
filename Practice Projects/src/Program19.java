import java.io.*;
import java.util.*;
public class Program19
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("Sample.txt");
			if(f.createNewFile())
			{
				System.out.println("File Created\n"+f.getName());
			}
			else
			{
				System.out.println("File Already Exists..");
			}
			FileWriter Writer= new FileWriter("Sample.txt");
			Writer.write("File Handling");
			Writer.close();
			System.out.println("Successfully written.");
			Scanner Reader=new Scanner(f);
			FileWriter fw = new FileWriter(f, true);    
            String lineToAppend = " in Java";    
            fw.write(lineToAppend);
            fw.close();
            while(Reader.hasNextLine())
			{
				String data1=Reader.nextLine();
				System.out.println(data1);
			}
			Reader.close();
			if (f.delete()) {
	            System.out.println("The deleted file is : "
	                               + f.getName());
	        }
	        else {
	            System.out.println(
	                "Failed in deleting the file.");
	        }
		}
		catch(IOException e)
		{
			System.out.println("An Error Occured");
		}
		
	}
}