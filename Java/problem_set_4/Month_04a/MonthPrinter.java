//Now write a class MonthPrinter which will instantiate a Month object, ask the user for a month number
//and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this
//June 30

//If the user enters an invalid month number print this error message: "Number must be 1 through 12"

//If the user enters a non-integer, give this error message: "Enter an integer"

//To be considered correct, you must enter the message exactly as specified.

//For the draft:
//In MonthPrinter, ask the usr for a number 1 to 12 and create a Month object with that number

/**
 * Exercises the methods in the Month class
 */
import java.util.Scanner;
public class MonthPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month number (1 through 12): " );
        int monthNumber = 0;
        String monthName = "";
        int numberDays = 0;
        if (in.hasNextInt())
        {
            monthNumber = in.nextInt();
            if (monthNumber < 1 || monthNumber > 12)
            {
                System.out.println("Number must be 1 through 12");
            }
            else
            {
                Month myMonth = new Month(monthNumber);
                monthName = myMonth.getMonthName();
                numberDays = myMonth.getNumberOfDays();
                System.out.printf("%s %d",monthName,numberDays);
            }
        }
        else
        {
            System.out.println("Enter an integer");
        }
    }
}
