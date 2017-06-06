package PrintString;

import java.util.*;
public class ReduceString {

	 public static void main(String args[])
	   {
	      String original;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reduce");
	      original = input.nextLine();
	 
	      int length = original.length();
	      do{

	    	   original = original.substring(0, original.length() - 1);
	    	   System.out.println("Reduce of entered string is: "+original);
	      }
	 
	      while  (length > 0);
	    	 
	        
	   }
	}
