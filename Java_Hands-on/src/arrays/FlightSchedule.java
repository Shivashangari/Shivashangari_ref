package arrays;

import java.util.Arrays;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

////Create a program that asks the user to enter the number of flights and their corresponding departure times.
//Store the departure times in an array. Sort the array in ascending order and display the sorted departure times.
public class FlightSchedule {
	Scanner userInput = new Scanner(System.in);
	 int  input_flights;
	
	void getFlightInput(){
       
		 System.out.print("Enter the number of flights: ");
		 input_flights = userInput.nextInt();
		
	}
	void get_flight_timing() {
		
		LocalTime[] depaturetime = new LocalTime[input_flights];
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");

		for (int i = 0; i < input_flights; i++) {

			System.out.println("Enter the depature time of flight" + (i + 1) + "");
			String input = userInput.nextLine();
			depaturetime[i] = LocalTime.parse(input, formatter);

		}
		Arrays.sort(depaturetime);
		System.out.println("Sorted Departure Times:");
		for (LocalTime time : depaturetime) {
			System.out.println(time.format(formatter));
		}
	}

}

//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class FlightSchedule {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("Enter the number of flights: ");
//        int numFlights = scanner.nextInt();
//        
//        LocalTime[] departureTimes = new LocalTime[numFlights];
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
//        
//        for (int i = 0; i < numFlights; i++) {
//            scanner.nextLine(); // Consume the newline character
//            System.out.print("Enter the departure time for flight " + (i + 1) + " (e.g., 9:30 am): ");
//            String input = scanner.nextLine();
//            departureTimes[i] = LocalTime.parse(input, formatter);
//        }
//        
//        Arrays.sort(departureTimes);
//        
//        System.out.println("Sorted Departure Times:");
//        for (LocalTime time : departureTimes) {
//            System.out.println(time.format(formatter));
//        }
//    }
//}
