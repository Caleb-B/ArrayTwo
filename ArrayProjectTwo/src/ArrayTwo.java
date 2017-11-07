// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;

public class ArrayTwo
{  // begin class
	
	final static int MAX = 20;
	
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
		int[] list;
		list = new int[MAX];
		list[0] = 0;
		list[1] = 1;
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q6");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		for (int i = 2; i < MAX; i++) {
			list[i] = list[i-1] + list[i-2];
		}
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
}  // end class