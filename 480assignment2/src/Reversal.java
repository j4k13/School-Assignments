
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacqueline Anderson
 */
public class Reversal {
	
	
    public static void reverseFile(File input,File output)throws FileNotFoundException
    {
    	//line currently being reversed
    	String currentchunk;
    	String linebuilding = "";
    	ArrayList <String> lineholder = new ArrayList <String>();
    	try 
    	{
			Scanner in = new Scanner(input);
			PrintWriter out = new PrintWriter(output);
			while(in.hasNextLine())
			{
				Scanner in2 = new Scanner(in.nextLine());
				linebuilding = "";
				while(in2.hasNext())
				{
					currentchunk = in2.next();
					linebuilding = currentchunk + " " + linebuilding;
				}
				lineholder.add(linebuilding);
				in2.close();
			}
			for(int i = 0 ; i < lineholder.size(); i++)
			{
				out.println(lineholder.get(lineholder.size() - i));
			}
			in.close();
			out.close();
		} 
    	catch (FileNotFoundException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
