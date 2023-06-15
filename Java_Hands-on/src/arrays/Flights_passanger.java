package arrays;

// Create a program that asks the user to enter the number of flights and the 
//number of passengers for each flight. Store the number of passengers for each flight in an array. 
//Calculate and display the total number of passengers for all flights.

import java.util.Scanner;

class Flights_passanger {
	Scanner scanner = new Scanner(System.in);

	public void count_flights_passanger() {

		System.out.print("Enter the number of flights: ");
		int numberOfFlights = scanner.nextInt();

		int[] passengersPerFlight = new int[numberOfFlights];
		for (int i = 0; i < numberOfFlights; i++) {
			System.out.print("Enter the number of passengers for flight " + (i + 1) + ": ");
			passengersPerFlight[i] = scanner.nextInt();
		}
		int totalPassengers = calculateTotalPassengers(passengersPerFlight);
		System.out.println("Total number of passengers for all flights: " + totalPassengers);
		scanner.close();
	}

	private int calculateTotalPassengers(int[] passengersPerFlight) {
		int totalPassengers = 0;

		for (int passengers : passengersPerFlight) {
			totalPassengers = totalPassengers + passengers;
		}
		return totalPassengers;
	}
}

