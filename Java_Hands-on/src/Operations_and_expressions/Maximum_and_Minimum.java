//Write a Java program that takes three numbers as input from the user and finds the maximum and minimum of the three numbers.
package Operations_and_expressions;

import java.util.Scanner;

class max_min {
	int First_number;
	int Second_number;
	int Third_number;

	void letsgetinput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		First_number = input.nextInt();
		System.out.println("Enter the Second number");
		Second_number = input.nextInt();
		System.out.println("Enter the Third number");
		Third_number = input.nextInt();
		input.close();
	}

	void Maximun() {

		if (First_number > Second_number && First_number > Third_number) {
			System.out.println(" largest number is:" + First_number);
		} else if (Second_number > First_number && Second_number > Third_number) {
			System.out.println("largest number is:" + Second_number);
		} else {
			System.out.println(" largest number is:" + Third_number);
		}
		;
	}

	void Minium() {
		if (First_number < Second_number && First_number < Third_number) {
			System.out.println(" Smallest number is:" + First_number);

		} else if (Second_number < First_number && Second_number < Third_number) {
			System.out.println("Smallest number is:" + Second_number);
		} else {
			System.out.println(" Smallest number is:" + Third_number);
		}
	}
}
public class Maximum_and_Minimum {

	public static void main(String[] args) {
		max_min output = new max_min();
		output.letsgetinput();
		output.Maximun();
		output.Minium();
	}

}
