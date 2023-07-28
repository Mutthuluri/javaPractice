package practice;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	System.out.println("Enter the year of your choice");
	Scanner vv = new Scanner(System.in);
	double year = vv.nextDouble();
	if(year%4==0) {
		System.out.println("Wow! The entered year is a Leap year");
	}
	else {
		System.out.println("You just Entered a normal Year It is not a Leap year");
	}
	}

}
