package practice;

import java.util.Scanner;

public class sportsTimeTable {

	public static void main(String[] args) {
		Scanner vv = new Scanner(System.in);
		System.out.println("Enter the day ");
		String day = vv.nextLine();
     switch(day) {
     case "Monday": {
    	 System.out.println("hockey");
     }
     break;
     case "Tuesday": {
    	 System.out.println("cricket");
     }
     break;
     case "Wednesday": {
    	 System.out.println("chess");
     }
     break;
     case "Thursday":{
    	 System.out.println("volley ball");
     }
     break;
     case "Friday":{
    	 System.out.println("handball");
     }
     break;
     case "Saturday":{
    	 System.out.println("kabaddi");
     }
     break;
     case "Sunday":{
    	 System.out.println("No games only sleep");
     }
     break;
     default:{
    	 System.out.println("Heartfully I dont like to play games");
     }
     }

	}

}
