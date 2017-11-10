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

import java.lang.reflect.Array;
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
		String out;
		
	// ***** create objects *****
		
		ProgramInfo Printer = new ProgramInfo();
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("ArrayExercise 1 Q6");
		out = "\n";
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		for (int i = 2; i < MAX; i++) {
			list[i] = list[i-1] + list[i-2];
		}
		
int[] temp_list = new int[3];
		
		int j = 0;
		
		for (int i = 0; i < 5; i++) {
			if (j < 3){
				temp_list[j] = list[i];
				j++;
			}
			else {
				out += temp_list[0] + "   	" + temp_list[1] + "   	" + temp_list[2] + "\n";
				temp_list = new int[3];
				j = 0;
				temp_list[j] = list[i];
				j++;
			}
		}
		
		for (int i = MAX - 6; i < MAX; i++) {
			if (j < 3){
				temp_list[j] = list[i];
				j++;
			}
			else {
				out += temp_list[0] + "   	" + temp_list[1] + "   	" + temp_list[2] + "\n";
				temp_list = new int[3];
				j = 0;
				temp_list[j] = list[i];
				j++;
			}
		}
		
		for (int i = 0; i < j - 1; i++) {
			out += temp_list[i] + "   	";
		}
		out += "\n";
		
	// ***** output *****
	
		// all formatted ouput is printed in this section
		
		System.out.println(out);
		out += "\n" + Printer.getClosing();
		output(Printer.getBanner("ArrayExercise 1 Q6") + out);
		
	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
	
	public static void output(String out) {
		JOptionPane.showMessageDialog(null, out);
	}  // end output
}  // end class