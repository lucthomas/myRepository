//hw05_11
//
// Complete this method to read integer scores from the user and find the average
 // Stop asking for input when the user enters zero or  a negative number
// keep a running total and keep track of the number of entries
// then find and return the average
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
//import java.util.Locale;
public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        
        System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
        Scanner in = new Scanner(System.in);
        //in.useLocale(Locale.US);
        int score = 0;
        int sum = 0;
        int count = 0;
    
        double average = 0;
        boolean stop = false;
        while (!stop)
        {
           if (in.hasNextInt())
           {
               score = in.nextInt();
               if (score >= 0)
               {
                   sum = sum + score;
                   count++;
                   System.out.print("Enter a score. -1 to quit: ");
               }
               else
               {
                   stop = true;
               }
           }
           else
           {
               stop = true;
           }
        }
        
        if (count > 0)
        {
            average = (double) sum/count;
        }
        else
        {
            average = 0;
        }
        System.out.print("The average is " + average);
        return average; 
    }
}
