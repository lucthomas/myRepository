// Bluej project: lesson6/average

import java.util.Scanner;
import java.util.Locale; // import Locale to ensure that Java reads the komma signs of the respective country for the double input
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int count = 0;
        double sum = 0;
        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end
        double value;
        //One way:
        //do
        //{
        //    System.out.print("Enter a value, 0 to quit: ");
        //    value = in.nextDouble();
        //    if (value != 0)
        //    {
        //        count++;
        //        sum = sum + value;
        //    }
        //}
        //while(value != 0);
        
        //Another way:
   
        
        boolean done = false;
        while(!done)
        {
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
            if(value != 0.0)
            {
                count++;
                sum = sum + value;
            }
            else
            {
                done = true;
            }
        }
         
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
