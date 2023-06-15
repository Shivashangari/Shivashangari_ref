package Operations_and_expressions;

//Write a Java program to calculate the simple interest. The program should prompt the user to enter the principal amount, interest rate, and time period, and then calculate and display the simple interest using the formula: Simple Interest = (Principal Amount * Rate * Time) / 100.
 
import java.util.Scanner;
class Calculate_Simple_Intrest {

	double simple_intrest;

	void Intrest_check() {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double Principal = Input.nextDouble();

		System.out.println("Enter the rate of intrest in percentage");
		double Rate = Input.nextDouble();

		System.out.println("Enter the time period");
		double Time = Input.nextDouble();

		simple_intrest = ((Principal * Rate * Time) / 100);
		System.out.println("Simple Intrest is" + " " + simple_intrest);

		Input.close();
	}
}

public class Simple_Intrest {
	public static void main(String[] args) {
		Calculate_Simple_Intrest output = new Calculate_Simple_Intrest();
		output.Intrest_check();

	}

}
