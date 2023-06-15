package Operations_and_expressions;

import java.util.Scanner;

// Write a Java program to convert temperature from Celsius to Fahrenheit. The program should prompt the user to enter a temperature in Celsius and then display the converted temperature in Fahrenheit using the formula: Fahrenheit = (Celsius * 9/5) + 32.

class Covert_Temperature_Farenheit {
	double Celsius;
	void temp() {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius");
		double Celsius=user_input.nextDouble();
		 double Fahrenheit = ( Celsius * 9/5) + 32;
		 System.out.println("Fahrenheit of the celsius mentioned"+" "+Fahrenheit+" "+"F (Farenheit)");
		 user_input.close(); 
	}
		
}

public class Temperature_To_Farenheit {
	public static void main(String[] args) {
		Covert_Temperature_Farenheit input= new Covert_Temperature_Farenheit();
		input.temp();

	}

}
