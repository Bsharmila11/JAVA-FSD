import java.io.*;
import java.util.*;
public class Program22
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
			Writer.write("File Handling in Java");
			Writer.close();
			System.out.println("Length of File After Writting the Content : "+f.length());
			System.out.println("Successfully Written.");
			FileWriter fw = new FileWriter(f, true);    
            String lineToAppend = " is the important concept";    
            fw.write(lineToAppend);
            fw.close();
            System.out.println("Length of File After Appending the Content : "+f.length());
            Scanner Reader=new Scanner(f);
            System.out.print("Displaying Contents of the File : ");
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
