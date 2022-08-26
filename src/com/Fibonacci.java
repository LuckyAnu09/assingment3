package com;

import java.util.Scanner;

public class Fibonacci {
	int fn  ;
public static void main(String[] args) {
	int f0 = 0;
	int f1 = 1;	
	Fibonacci f = new Fibonacci();
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter the the number to which the fibonacci to be found:");
	int n = myObj.nextInt();
	int fn = f.findFebo(n);
	//fn= f0+f1;
	System.out.println("fibonacci number is :" +fn);

}

private int findFebo(int n) {
	// TODO Auto-generated method stub
	
	//findFebo(0)=0;
	
	for(int i=2;i<=n;i++)
	{
		
		fn = findFebo(n-1)+ findFebo(n-2);
	}
	
	if(n==0) return 0;
	if(n==1) return 1;
	else
	{
		return fn;
	}
	
}

}
