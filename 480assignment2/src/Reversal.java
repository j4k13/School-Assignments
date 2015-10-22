
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
    	if(!input.exists())
    	{
    		FileNotFoundException e = new FileNotFoundException("Input file is not here!");
    		throw e;
    	}
    	if(!output.exists())
    	{
    		FileNotFoundException e = new FileNotFoundException("Output file is not here!");
    		throw e;
    	}
    	//line currently being reversed
    	String currentchunk;
    	//next line being build
    	String linebuilding = "";
    	//holds build line to put in the new file
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
