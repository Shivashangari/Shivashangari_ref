package Control_Statenments;

import java.util.Scanner;

class vowels {
	char ch;

	void checkvowels() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character here :)");
		//nninput.next();
		 char ch = input.next().charAt(0);
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + "is a vowels");
			break;
			
		
		   default:
			System.out.println(ch + "is a constant");
			input.close();
		}
	}

}
public class Vowels_and_Consonents {

	public static void main(String[] args) {	
		vowels output=new vowels();
		output.checkvowels();
		
		
	}
}