// BlueJ project: lesson6/largest2

// Read in the values from the file input.txt, stopping
// at the end of the file (or if the file contains
// an input that is not a number). Print out the largest
// value that you read.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

public class Largest2
{
    public static void main(String[] args)
    throws FileNotFoundException //Signals that an attempt to open the file denoted by a specified pathname has failed.
    {
        String fileName = "input.txt";
        String nextFileName = "input2.txt";
        String newFileName = "numberfile.txt";
        File inputFile = new File(fileName);
        Scanner in = new Scanner(inputFile);
        in.useLocale(Locale.US);
        double largest = 0;
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Largest value: " + largest);
    }
}
