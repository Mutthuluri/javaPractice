package practice;

import java.util.Scanner;

public class Distanca_between_two_cities_using_lat_and_long {

	public static void main(String[] args) {

				Scanner vv  = new Scanner(System.in);

		        System.out.println("Enter the latitude and longitude of City 1 (in degrees):");
		        double lat1 = vv.nextDouble();
		        double lon1 = vv.nextDouble();

		        System.out.println("Enter the latitude and longitude of City 2 (in degrees):");
		        double lat2 = vv.nextDouble();
		        double lon2 = vv.nextDouble();

		        // Calculate the distance between the two cities using the haversine formula
		        double distance = calculateDistance(lat1, lon1, lat2, lon2);

		        System.out.println("The distance between the two cities is: " + Math.round(distance) + " kilometers.");

		        vv.close();
		    }

		    // Method to calculate the distance between two points using the haversine formula
		    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
		        // The radius of the Earth in kilometers
		        final double EARTH_RADIUS = 6371.0;

		        // Convert latitude and longitude from degrees to radians
		        lat1 = Math.toRadians(lat1);
		        lon1 = Math.toRadians(lon1);
		        lat2 = Math.toRadians(lat2);
		        lon2 = Math.toRadians(lon2);

		        // Calculate the differences between latitudes and longitudes
		        double dLat = lat2 - lat1;
		        double dLon = lon2 - lon1;

		        // Use the haversine formula to calculate the distance
		        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dLon / 2), 2);
		        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		        // Calculate the distance in kilometers
		        double distance = EARTH_RADIUS * c;

		        return distance;
		    }
		}
