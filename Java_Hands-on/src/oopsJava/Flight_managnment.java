package oopsJava;

import java.util.Scanner;

//Implement a Flight class with the following attributes: flightNumber, source, destination, duration, and fare. 
//Implement appropriate getters and setters for these attributes. Create a subclass named InternationalFlight that extends the Flight class. 
// Add an additional attribute called visaRequirements for the InternationalFlight class.
// public class Flight_managnment
//
//{
//
//	Scanner input = new Scanner(System.in);
//	private int flightnumber;
//	private String source;
//	private String destination;
//	private String duration;
//	private double fare;
//
//	public int getFlightnumber(int flightnumber, String source, String destination, int duration, double fare) {
//		return flightnumber;
//	}
//
//	public void setFlightnumber(int flightnumber) {
//		this.flightnumber = flightnumber;
//	}
//
//	public String getSource() {
//		return source;
//	}
//
//	public void setSource(String source) {
//		this.source = source;
//	}
//
//	public String getDestination() {
//		return destination;
//	}
//
//	public void setDestination(String destination) {
//		this.destination = destination;
//	}
//
//	public String getDuration() {
//		return duration;
//	}
//
//	public void setDuration(String duration) {
//		this.duration = duration;
//	}
//
//	public double getFare() {
//		return fare;
//	}
//
//	public void setFare(double fare) {
//		this.fare = fare;
//	}
//
//	
//	
//	class Managnmnet extends Flight_managnment {
//	    private String visaRequirements;
//
//	    // Constructor
//	    public Managnmnet(int flightnumber, String source, String destination, int duration, double fare, String visaRequirements)
//	    {
//	        super();
//	        this.visaRequirements = visaRequirements;
//	    }
//
//	    // Getter and setter for visaRequirements
//	    public String getVisaRequirements() {
//	        return visaRequirements;
//	    }
//
//	    public void setVisaRequirements(String visaRequirements) {
//	        this.visaRequirements = visaRequirements;
//	    }
//	}
// 
//	public void flightManagnment() {
//		System.out.println("Flight number");
//		int flightnumber = input.nextInt();
//		System.out.println("source");
//		int source = input.nextInt();
//		System.out.println("destination");
//		int destination = input.nextInt();
//		System.out.println("duration");
//		int duration = input.nextInt();
//		System.out.println("fare");
//		double fare = input.nextInt();
//	
//	}
//}

 








public class Flight_managnment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Flight details from user
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter source: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter duration (in hours): ");
        int duration = scanner.nextInt();
        System.out.print("Enter fare: $");
        double fare = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Create Flight instance
        Flight flight = new Flight(flightNumber, source, destination, duration, fare);

        // Get InternationalFlight details from user
        System.out.print("Enter visa requirements: ");
        String visaRequirements = scanner.nextLine();

        // Create InternationalFlight instance
        InternationalFlight internationalFlight = new InternationalFlight(flightNumber, source, destination, duration, fare, visaRequirements);

        // Print Flight details
        System.out.println("\nFlight Details:");
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Source: " + flight.getSource());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Duration: " + flight.getDuration() + " hours");
        System.out.println("Fare: $" + flight.getFare());

        // Print InternationalFlight details
        System.out.println("\nInternational Flight Details:");
        System.out.println("Flight Number: " + internationalFlight.getFlightNumber());
        System.out.println("Source: " + internationalFlight.getSource());
        System.out.println("Destination: " + internationalFlight.getDestination());
        System.out.println("Duration: " + internationalFlight.getDuration() + " hours");
        System.out.println("Fare: $" + flight.getFare());

}
}