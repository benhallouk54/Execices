package PrintString;

import java.util.Arrays;

public class LargestNumber {

	public static int GetLargestNumber(int number) {
		String strNumber = Integer.toString(number);
		
		char[] charDigits = strNumber.toCharArray();
		Arrays.sort(charDigits);
		String result  = "";
		for(int index=0;index<charDigits.length;index++)
		{
			result+=charDigits[charDigits.length-index-1];
		}
		
		return Integer.parseInt(result);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println( GetLargestNumber(1245));
		
		//System.out.println();
		
		/*
		while(isSorted)
		for(int index=0;index<strNumber.length()-1;index++)
		{
			isSorted = true;			
			if(digits[index]<digits[index+1])
			{
				char temp = digits[index];
				digits[index] = digits[index+1];
				digits[index+1] = temp;
				isSorted = false;
			}		
		}
		*/
	}

}
