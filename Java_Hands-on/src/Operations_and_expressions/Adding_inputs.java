package Operations_and_expressions;

// Write a Java program that prompts the user to enter a four-digit integer and then prints the sum of its digits.
import java.util.Scanner;

class Add_input {
	int number;
	int newnumber;
	int sum;
	void add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your four digit number here");
		int number = input.nextInt();

		for (sum = 0; number != 0; number = number / 10) {
			sum = sum + number % 10;
			input.close();
		}
		System.out.println("Sum of the four digits are" + " " + sum);
	}
}
public class Adding_inputs {

	public static void main(String[] args) {
		Add_input output = new Add_input();
		output.add();
	}
}
