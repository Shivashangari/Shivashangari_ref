package Operations_and_expressions;

// Write a Java program that calculates the area of a rectangle. The program should prompt the user to enter the length and width of the rectangle and then display the calculated area.

import java.util.Scanner;

class Findarea {
	public void area_of_rectangle() {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the length rectangle");
		double length = userinput.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width = userinput.nextDouble();
		double area = length * width;
		System.out.println("Area of rectangle" + " " + area);
		userinput.close();
	}
	
}

public class Area_of_rectangle {
	public static void main(String[] args) {
		Findarea area_output=new Findarea();
		area_output.area_of_rectangle();

	}

}
