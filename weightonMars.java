/* wite a program for Weight on Mars calculator is one of the fun and simple programs 
		of Java to implement as a beginner. This program calculates a person’s weight on Mars 
		based on their weight on Earth. Allyou need to do is ask the user for their weight on Earth
		and then print out their weight on Mars.
		In order to convert weight on Earth to weight on Mars, use the coefficient of 0.38. This 
		means thatif someone weighs 100 pounds on Earth, they would weigh 38 pounds on Mars.*/
package practice;

import java.util.Scanner;

public class weightonMars {

	public static void main(String[] args) {
		
		
				double marsWeight;
				System.out.println("Enter the Weight on Earth");
				Scanner vv = new Scanner(System.in);
				double earthweight = vv.nextDouble();
				marsWeight = (earthweight/100)*38;
				System.out.println("Weight on Mars :" + marsWeight);
			}

		}
