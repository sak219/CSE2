//Sam Kiernan
//September 3, 2015
//Cse02
//Lab02-Cyclometer

public class Cyclometer{
    public static void main(String[] args){
        //Program is meant to measure speed, distance, etc., through recording
        //two kinds of data; time elapsed in seconds, and number of rotations on front wheel
        
        
        //Trip Values
        int secsTrip1 = 480; // How many seconds trip 1 took
        int secsTrip2 = 3220; // Seconds for trip 2
        int countsTrip1 = 1561; // Wheel roations on trip 1
        int countsTrip2 = 9037; // Wheel rotations on trip 2
        
        //Other Values
        double wheelDiameter = 27.0, // Diameter of the Wheel
        PI = 3.14159, // Approximate value of PI, useful in calculations
        feetPerMile = 5280, // How many feet there are in a Mile
        inchesPerFoot = 12, //How many inches in a foot
        secondsPerMinute = 60; // How many seconds in a minute
        
        //Calculating how long Trip 1 took
        System.out.println("Trip 1 took " + 
        (secsTrip1/secondsPerMinute) + " minutes and had " + countsTrip1+" counts.");
        
        //Calculating how long Trip 2 took
        System.out.println("Trip 2 took " + 
        (secsTrip2/secondsPerMinute) + " minutes and had " + countsTrip2+" counts.");
        
        //Making the neccesary calculations to determine how long the trip was in miles
            //Calculating the distance in inches for Trips 1 and 2
        double distanceTrip1=countsTrip1*wheelDiameter*PI,
               distanceTrip2=countsTrip2*wheelDiameter*PI;
            //Calculating the distance in miles for Trips 1 and 2
        double milesTrip1 = (distanceTrip1/inchesPerFoot)/feetPerMile;
        double milesTrip2 = (distanceTrip2/inchesPerFoot)/feetPerMile;
        
        double totalDistance = milesTrip1 + milesTrip2; // Total distance of both trips in miles
        
        //Printing out the values
        System.out.println("Trip 1 was " + milesTrip1 + " miles");
        System.out.println("Trip 2 was " + milesTrip2 + " miles");
        System.out.println("The total distance was " + totalDistance + " miles");
        
    }
}