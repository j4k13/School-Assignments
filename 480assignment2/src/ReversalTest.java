import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.Test;

public class ReversalTest {
	@Test
	public void testreverseFile()
	{
	try
	{
		File input = new File("file");
		File output = new File("file");
		File expected = new File("file");
		PrintWriter outin = new PrintWriter(input);
		PrintWriter outout = new PrintWriter(expected);
		Scanner in = new Scanner(input);
		outin.println("it. it,");
		outout.println("it, it.");
		Reversal.reverseFile(input,output);
		assertEquals("",output,expected);
		outin.close();
		outout.close();
		in.close();
	}
	catch(FileNotFoundException e)
	{
		
	}
	//case with two lines to check that it works with multiple lines
	try
	{
		File input = new File("file");;
		File output = new File("file");
		File expected = new File("file");
		PrintWriter outin = new PrintWriter(input);
		PrintWriter outout = new PrintWriter(expected);
		Scanner in = new Scanner(input);
		outin.println("it. it,");
		outin.println("since then");
		outout.println("then since");
		outout.println("it, it.");
		Reversal.reverseFile(input,output);
		assertEquals("",output,expected);
		outin.close();
		outout.close();
		in.close();
	}
	catch(FileNotFoundException e)
	{
		
	}
	try
	{
		File input = new File("file");
		File output = new File("file");
		File expected = new File("file");
		PrintWriter outin = new PrintWriter(input);
		PrintWriter outout = new PrintWriter(expected);
		Scanner in = new Scanner(input);
		outin.println("it. here! it,");
		outin.println("since there? then");
		outout.println("then there? since");
		outout.println("it, here! it.");
		Reversal.reverseFile(input,output);
		assertEquals("",output,expected);
		outin.close();
		outout.close();
		in.close();
	}
	catch(FileNotFoundException e)
	{
		
	}
	//three lines three "words"
	try
	{
		File input = new File("file");
		File output = new File("file");
		File expected = new File("file");
		PrintWriter outin = new PrintWriter(input);
		PrintWriter outout = new PrintWriter(expected);
		Scanner in = new Scanner(input);
		outin.println("it. here! it,");
		outin.println("since there? then");
		outin.println("%% $$ ,,");
		outout.println(",, $$ %%");
		outout.println("then there? since");
		outout.println("it, here! it.");
		Reversal.reverseFile(input,output);
		assertEquals("",output,expected);
		outin.close();
		outout.close();
		in.close();
	}
	catch(FileNotFoundException e)
	{
		
	}
	try
	{
		File input = new File("file");
		File output = new File("file");
		File expected = new File("file");
		PrintWriter outin = new PrintWriter(input);
		PrintWriter outout = new PrintWriter(expected);
		Scanner in = new Scanner(input);
		outin.println("it. here! it,");
		outin.println("since there? then");
		outin.println("");
		outout.println("");
		outout.println("then there? since");
		outout.println("it, here! it.");
		Reversal.reverseFile(input,output);
		assertEquals("",output,expected);
		outin.close();
		outout.close();
		in.close();
	}
	catch(FileNotFoundException e)
	{
		
	}
	}
}
