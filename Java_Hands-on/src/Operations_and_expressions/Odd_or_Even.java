package Operations_and_expressions;

// Write a Java program to check if a number entered by the user is even or odd.

import java.util.Scanner;

class Check_odd_even {
	public void oddeven() {

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter your input here");
			int number = input.nextInt();
			System.out.println("Entered value is an Integer");

			if (number % 2 == 0) {
				System.out.println("An 'Even' number");
			}

			else {
				System.out.println("An 'Odd' number");

			}
		} catch (Exception e) {

			System.out.println("'Invalid Input',Plaese enter a valid input as a 'Integer'");

		}

		input.close();
	}
}

public class Odd_or_Even {

	public static void main(String[] args) {
		Check_odd_even output = new Check_odd_even();
		output.oddeven();

	}
}
