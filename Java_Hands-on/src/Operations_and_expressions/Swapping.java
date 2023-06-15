package Operations_and_expressions;
// Write a Java program that swaps the values of two variables without using a temporary variable.
//import java.util.Scanner;

import java.util.Scanner;

class swapp {
	void Before_and_After() {
		int input1;
		int input2;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the input1");
		input1 = input.nextInt();
		System.out.println("Value of input2");
		input2 = input.nextInt();

		System.out.println("values Before swapping");
		System.out.println("Intital value of input1>>" +" "+ input1);
		System.out.println("Intital value of input2>>" +" "+input2);
		
		// swapping values
		input1 = input1 + input2;
		input2 = input1 - input2;
		input1 = input1 - input2;
		System.out.println("values After swapping");
		System.out.println("Intital value of input1>>" +" "+ input1);
		System.out.println("Intital value of input2>>" +" "+ input2);
		input.close();

	}

}

public class Swapping {

	public static void main(String[] args) {
		swapp output_swap = new swapp();
		output_swap.Before_and_After();

	}

}


// 	In abstract method

//abstract class Letsswapp {
//	abstract void before_swap();
//
//	abstract void After_swap();
//}
//
//class input_swap {
//	int input1;
//	int input2;
//	Scanner input = new Scanner(System.in);
//
//	void scanner() {
//
//		System.out.println("Enter the input1");
//		input1 = input.nextInt();
//		System.out.println("Value of input2");
//		input2 = input.nextInt();
//
//	}
//
//	void before_swap() {
//
//		System.out.println("values Before swapping");
//		System.out.println("Intital value of input1>>" + " " + input1);
//		System.out.println("Intital value of input2>>" + " " + input2);
//	}
//
//	void After_swap() {
//
//		input1 = input1 + input2;
//		input2 = input1 - input2;
//		input1 = input1 - input2;
//		System.out.println("values After swapping");
//		System.out.println("Intital value of input1>>" + " " + input1);
//		System.out.println("Intital value of input2>>" + " " + input2);
//		input.close();
//
//	}
//
//}
//
//public class Swapping {
//	public static void main(String[] args) {
//		input_swap output_swapping = new input_swap();
//		output_swapping.scanner();
//		output_swapping.before_swap();
//		output_swapping.After_swap();
//	}
//}
