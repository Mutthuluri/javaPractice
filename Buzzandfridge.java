/* Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” 
instead of thenumber and for the multiples of ‘5’ print “Buzz”.*/
package practice;

public class Buzzandfridge {

	public static void main(String[] args) {
		int num;
		for(num=1;num<101;num++) {
			if(num%3==0) {
				System.out.println("Fizz");
			}
			else if(num%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(num);
			}
		}
	}

}
