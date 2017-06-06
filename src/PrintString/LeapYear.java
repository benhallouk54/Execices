package PrintString;

import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) 
	{
		int year;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
 
		System.out.println("Enter a year");
		year = input.nextInt();
		
		if(year%4 == 0)
	 	{
			if(!(year%100 == 0) || (year%400 == 0))
			{
				System.out.println("this year is leap");
			}
			else
			{
				System.out.println("this year is not leap");			 
			}
	 	}
		else
		{
			System.out.println("this year is not leap");			
		}
	}
}