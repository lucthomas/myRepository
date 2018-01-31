// BlueJ project: lesson6/darts

// Generate a random floating-point number and transform it so
// that it is between -1 and 1. Store in x. Repeat for y.
// Check that (x, y) is in the unit circle, that is, the distance
// between (0, 0) and (x, y) is <= 1.

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

import java.util.Random;
import java.util.Scanner;

/**
   This program computes an estimate of pi by simulating dart throws onto a square.
*/
public class MonteCarlo
{
    public static void main(String[] args)
    {
        System.out.println("Number of tries");
        Random generator = new Random(42); // 42 is the seed or initial value of the generator
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();
        int radius = 1;
        // The center of the circle is in point (0,0)
        int centerX = 0; 
        int centerY = 0;

        int hits = 0;
        for (int i = 1; i <= tries; i++)
        {
            // Generate two random numbers between -1 and 1

            double x = generator.nextDouble()*2 - 1; //go from 0 => 1 to 0 => 2 and then substract 1 to get to -1 => 1

            double y = generator.nextDouble()*2 - 1;

            // Check whether the point lies in the unit circle
            double distance = Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
            if (distance <= radius)
            {
                hits++;
            }
        }

        /*
           The ratio hits / tries is approximately the same as the ratio
           circle area / square area = pi / 4 = pi*radius^2 / 2*2 with radius equal to 1 and square length equal to 2
        */

        double piEstimate = 4.0 * hits / tries;
        System.out.println("Estimate for pi: " + piEstimate);
    }
}
