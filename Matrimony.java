package practice;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner vv = new Scanner(System.in);
		int age = vv.nextInt();
		if ( age >18 && age<30) {
			System.out.println("Your match is found");
		}
		else if ( age >18 && age <30) {
			System.out.println("Hard but you can still have hope");
		}
		else if ( age > 46) {
			System.out.println("Better luck for nexr life");
		}
		else if (age < 18) {
			System.out.println("First grow and then come");
		}
		else {
			System.out.println("it is waste of your time for marriage ");
		}
	}

}
