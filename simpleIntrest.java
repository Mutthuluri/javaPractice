package practice;

import java.util.Scanner;

public class simpleIntrest {

	public static void main(String[] args) {
		double principle,time,rate,intrest;
		System.out.println("Enter the principle amount : ");
		Scanner vv = new Scanner(System.in);
		principle = vv.nextDouble();
		System.out.println("Enter the principle rate : ");
		rate = vv.nextDouble();
		System.out.println("Enter the principle time : ");
		time = vv.nextDouble();
		intrest = (principle*rate*time)/100;
		System.out.println(intrest);
	}
}
