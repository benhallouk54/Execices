package PrintString;

import java.util.Scanner;

public class DNA {

	public static void main(String[] args) {
		char rna;

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a rna");
		rna = input.next().charAt(0);
/*
		if (rna == 'g') {
			System.out.println("your correspondind rna is :" + 'C');
		}
		if(rna == 'c')
		{
			System.out.println("your correspondind rna is :"+ 'G' );
		}
		if(rna == 't')
		{
			System.out.println("your correspondind rna is :"+ 'A' );
		}
		if(rna == 'a')
		{
			System.out.println("your correspondind rna is :"+ 'U' );
		}
*/
		switch(rna){
			case 'g':
				System.out.println("your correspondind rna is :" + 'C');
				break;
			case 'c':
				System.out.println("your correspondind rna is :"+ 'G' );
				break;
			case 't' :
				System.out.println("your correspondind rna is :"+ 'A' );
				break;
			case 'a':
				System.out.println("your correspondind rna is :"+ 'U' );
				break;
			default :
				System.out.println("wa tanoud");
		}
	}
}
