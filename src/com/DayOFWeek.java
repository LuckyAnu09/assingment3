package com;

import java.util.Scanner; // Import the Scanner class

public class DayOFWeek {

	public static void main(String[] args) {

		DayOFWeek d = new DayOFWeek();

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter the number between 1-7 to get day of the week:");

		int n = myObj.nextInt();
		System.out.println("Day of the week :" + d.day(n));

	}

	private String day(int n) {
		// TODO Auto-generated method stub
		switch (n) {

		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "Please enter valid number";

		}

	}
}