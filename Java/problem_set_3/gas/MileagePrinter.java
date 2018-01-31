//Write a program called MilagePrinter that asks the user to input the following values:
//	The number of gallons currently in the tank
//	The fuel efficiency in miles per gallon

//and then prints how far the car can go on the gas in the tank and the cost of driving 100 miles. 
//Print the distance with 1 decimal point and the cost with 2 decimals.

//Use System.out.print and not System.out.println. Otherwise your output will not be
//formatted correctly

//Assume the cost per gallon is $3.95. Define it as a constant:
//     final double COST_PER_GALLON = 3.95;

//If value entered for efficiency is less than or equal to 0, print "No can go".
//Otherwise continue with the calculations. You output should be in the exact
//format shown below. The text will be identical - only the numbers will change.

//Sample runs for the final version:
//Enter the number of gallons of gas in the tank 5.1
//Enter the fuel efficiency 35.0
//Distance:   178.5
//Cost:       11.29

//Enter the number of gallons of gas in the tank 25
//Enter the fuel efficiency -5
//No can go 

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 2" for some tips on 
// how to begin. 

//Important: Be sure to print the string exactly as shown 

import java.util.Scanner;

public class MileagePrinter
{
   public static void main(String[] args)
   {
       final double COST_PER_GALLON = 3.95; // Cost per gallon
       final double DISTANCE_DRIVEN = 100; // Miles driven
       
       Scanner scanGas = new Scanner(System.in);
       System.out.print("Enter the number of gallons of gas in the tank ");
       double gasInTank = scanGas.nextDouble(); // Gallons
       
       Scanner scanEff = new Scanner(System.in);
       System.out.print("Enter the fuel efficiency ");
       double fuelEfficiency = scanEff.nextDouble(); // Miles per gallon
       
       double distance = fuelEfficiency*gasInTank;
       double cost = COST_PER_GALLON*(DISTANCE_DRIVEN/fuelEfficiency);
       
       if (fuelEfficiency <= 0)
       {
           System.out.println("No can go");
       }
       else
       {
           System.out.printf("Distance: %6.1f\n", distance);
           System.out.printf("Cost: %10.2f\n", cost);
       }

   }
}
