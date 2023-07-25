package practice;

import java.util.Scanner;

public class Lotterywithavk {

	public static void main(String[] args) {
		 int lottery = (int) (Math.random()*100);
		 System.out.println("Enter a random number from 10 to 99");
		 Scanner vv = new Scanner(System.in);
		 int guess = vv.nextInt();
		 if(guess == lottery) {
			 System.out.println("Congratulations you won the Lottery");
		 }
		 else {
			 System.out.println("Oh better luck next time");
		 }
	}

}
