package practice;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
    Scanner vv = new Scanner(System.in);
    System.out.println("ENter the Number : ");
    int num = vv.nextInt();
    
    if (num%2==0) {
    	System.out.println("The given number is even");
    }
    else {
    	System.out.println("The given number is odd");
    }
    	
	}

}
