// Write a program on Temperature Conversion
package practice;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		double fah,cel;
		System.out.println("Enter the value");
		Scanner vv = new Scanner(System.in);
		cel = vv.nextDouble();
	
		fah=(cel*9/5)+32;
		System.out.println(fah);
	}

}
