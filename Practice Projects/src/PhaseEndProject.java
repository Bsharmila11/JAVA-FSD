import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class PhaseEndProject
{
	public static void main(String[] args) 
	{
        		Scanner scan=new Scanner(System.in);
        		System.out.println("**************************************\n");
        		System.out.println("\nWelcome to The Application \n");
        		System.out.println("**************************************");
        		while(true)
        		{
        			System.out.println("1. Displaying the Files in Ascending Order.\n");
            			System.out.println("2. Perform File Operations like Adding , Deleting and Searching Files . \n");
            			System.out.println("3. Closing the Application.");
            			System.out.println("Select your Option  \n");
            			int choice = scan.nextInt();
            			switch(choice)
            			{
                				case 1:
                						sortFiles();
                						break;
                				case 2:
                    					Boolean temp = true;
                    					while(temp) 
                    					{
                        						System.out.println("Add a user specified file to the Directory.\n");
                        						System.out.println("Delete a user specified file from the Directory. \n");
                        						System.out.println("Search a user specified file in the Directory.\n");
                        						System.out.println("Navigates to Main Menu.\n");
                        						System.out.println("Close the Application.\n");
                        						System.out.println("Select your Option  \n");
                        						int choice2 = scan.nextInt();
                        						switch (choice2) 
                        						{
                            							case 1:
                            									newFile();
                                								break;
                            							case 2:
                            									deleteFile();
                            									break;
                            							case 3:
                            									searchFile();
                            									break;
                            							case 4:
                            									temp = false;
                                								break;

                            							case 5:
                            									closeApp();
                                								System.exit(0);
                            							default:
                                								System.out.println("Input correct value and retry");
                        						}
                    					}
                    					break;
                				case 3:
                    					closeApp();
                    					System.exit(0);
                				default:
                    					System.out.println("Input correct value and retry");
                    					break;
            			}
        		}
	}
	public static void newFile()
    	{
        		String strPath = "", strName = "";
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            			System.out.println("Enter the file name:\n");
            			strName = br.readLine();
            			System.out.println("Enter the file path:\n");
            			strPath = br.readLine();
  			File file1= new File(strPath + "" + strName + ".txt");
			if(file1.createNewFile())
			{
				System.out.println("File Created\n"+file1.getName());
			}
			else
			{
				System.out.println("File Already Exists..");
			} 
        		}
 		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
	}
	public static void searchFile()
	{
		String strName = "";
		try
		{
			File directory = new File("C:\\Users\\sharm\\Desktop\\Java Training\\Practice Projects\\Practice Projects\\Files/");
 			String[] flist = directory.list()	;
			int flag = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            			System.out.println("Enter the file name:\n");
            			strName = br.readLine();
        			if (flist == null) 
			{
            				System.out.println("Empty directory.\n");
        			}
        			else 
			{
  				for (int i = 0; i < flist.length; i++) 
				{
                					String filename = flist[i];
                					if (filename.equalsIgnoreCase(strName)) 
					{
                    					System.out.println(filename + " found\n");
                    					flag = 1;
                					}
            				}
        			}
  			if (flag == 0) 
			{
            				System.out.println("File Not Found\n");
        			}
		}
		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
		
	}
	public static void deleteFile()
	{
		String strPath = "", strName = "";
		try
		{
			File directory = new File("C:\\Users\\sharm\\Desktop\\Java Training\\Practice Projects\\Practice Projects\\Files/");
 			String[] flist = directory.list();
    			for(int i=0;i<flist.length;i++)
			{
   				String f4=flist[i];
				System.out.println(f4);
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        			System.out.println("Enter the file name:\n");
        			strName = br.readLine();
        			System.out.println("Enter the file path:\n");
        			strPath = br.readLine();
 			File file1= new File(strPath + "" + strName + ".txt");
 			if (file1.delete()) 
			{
            				System.out.println("File deleted successfully\n");
        			}
        			else 
			{
            				System.out.println("Failed to delete the file\n");
        			}
		}
		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
	}
	public static void sortFiles()
	{
		String strpath="";
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the file path:");
			strpath = br.readLine();
			File f=new File(strpath);
			File s[]=f.listFiles();
			Arrays.sort(s);
			for(int i=0;i<s.length;i++)
        		    System.out.println(s[i].getName());
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
            
	}
	private static void closeApp() 
	{
        		System.out.println("Closing your application... \nThank you!");
	}
}
