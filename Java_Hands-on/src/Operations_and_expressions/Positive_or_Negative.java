package Operations_and_expressions;

import java.util.InputMismatchException;
import java.util.Scanner;

class PositiveNegative {
	void check_positive_negative() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the input integer");
			int Number = input.nextInt();
			System.out.println("Enter input is an integer");
			if (Number > 0) {
				System.out.println("Input number is 'POSITIVE'");

			} else if (Number == 0) {

				System.out.println("Input number is 'ZERO',Neither positive nor Negative");

			}

			else if (Number < 0) {
				System.out.println("Input number is Negative");
				input.close();
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");

		}
	}
}

public class Positive_or_Negative {

	public static void main(String[] args) {
		PositiveNegative output = new PositiveNegative();
		output.check_positive_negative();
	}

}
