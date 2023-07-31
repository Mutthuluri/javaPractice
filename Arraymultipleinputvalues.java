package practice;

import java.util.Scanner;

public class Arraymultipleinputvalues {

	public static void main(String[] args) {
		double[]Kumar = new double[5];
	    Scanner vv = new Scanner(System.in);
	    System.out.println("Enter"+Kumar.length+"values:");
	    for(int i=0;i<Kumar.length;i++) {
	    	Kumar[i] = vv.nextDouble();
	    }
	    for(int i=0;i<Kumar.length;i++) {
	    	System.out.println("THe stored values of array are");
	    	System.out.println(Kumar[i]);
	    }
	    
	}

}
