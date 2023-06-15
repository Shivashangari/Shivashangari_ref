package arrays;

import java.util.Scanner;

//Create a program that asks the user to enter the number of rows and columns in an airplane seating arrangement. 
//Create a two-dimensional array to represent the seating arrangement. Initialize the array with 0 to indicate that all seats are available.
//Allow the user to select a seat by entering the row and column numbers. Update the array to indicate that the
//selected seat is occupied (set the corresponding element to 1). Display the updated seating arrangement after each seat selection.

class seat_availability {
	Scanner input = new Scanner(System.in);
	int selectcolumm;
	int selectrow;
	int[][] seat_arrangnment;

	int get_row() {
		System.out.println("Enter the number of rows:");
		int row = input.nextInt();
		return row;
	}

	int get_column() {
		System.out.println("Enter the number of column");
		int column = input.nextInt();
		return column;
	}

	void set_row_column(int row, int column) {

		 seat_arrangnment = new int[row][column];

		displayseat(seat_arrangnment);

	}
	
	void select_sit(int row, int column) {

		 seat_arrangnment[row][column] = 1;
		 displayseat(seat_arrangnment);

	}

	public void select_row(int row, int column) {

		System.out.println("Select  seat of row/rows  1-" + row + ")");
		selectrow = input.nextInt();
		System.out.println("Select seat of column/columns (1-" + column + ")");
		selectcolumm = input.nextInt();
		try {
			if (selectrow <= 0 || selectrow > row || selectcolumm <= 0 || selectcolumm > column) {
				System.out.println("Invalid seat selection!,Please give the inputs");
			}else {
				select_sit(selectrow,selectcolumm);
				
			}
		} 
		catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Invalid input");

		}
	}

	 void displayseat(int[][] seat_arrangnment) {
		for (int[] row : seat_arrangnment) {
			for (int seat : row) {
				System.out.print(seat + " ");
			}
			System.out.println();
		}

	}

	void set_allotnment() {
		if (seat_arrangnment[selectrow - 1][selectcolumm - 1] == 0) {
			//seat_arrangnment[selectrow - 1][selectcolumm - 1] = 1;
			System.out.println("Seat (" + selectrow + ", " + selectcolumm + ") is successfully selected.");
			displayseat(seat_arrangnment);
		} else {
			System.out.println("Seat (" + selectrow + ", " + selectcolumm + ") is already occupied.");
		}
	}
}
