package com;

import java.util.Scanner;
import java.util.*; 

public class LeapYear {

	
	
	public static void main(String[] args) {
		
		LeapYear l = new LeapYear();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter the 2 years between which, you want leap year:");
	int n1 = myObj.nextInt();
	int n2 = myObj.nextInt();
	
	l.listOfYears(n1,n2);

}

	private void listOfYears(int n1, int n2) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> leapYears = new ArrayList<Integer>();
		System.out.println(n2);
		
		for(int i=n1;i<=n2;i++)
		{
			if(n1%4==0)
			{
				leapYears.add(n1);
				n1++;
			}
			else {
				n1++;
			}
			
		}
		
		for(int k : leapYears)
		{
			System.out.println(k);
		}
		
	}
	
}
