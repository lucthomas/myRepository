// Bluej project: lesson6/average_q
import java.util.Scanner;
import java.util.Locale;
// TODO: Update your method average() so that it can accept
// altitudes (which can be positive, negative or zero).
// Use Q as a sentinel value instead of 0.
// Use the scanner method hasNextDouble to control your loop.
// Remember to change the prompt.
public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double value;
        int count = 0;
        double sum = 0;
        int Q = 0;
        double error = 0;
        Scanner q = new Scanner(System.in);
        q.useLocale(Locale.US);
        boolean enough = false;
        
        System.out.print("Give an integer sentinel value: "); 
        
        while (!enough)
        {
            if (!q.hasNextInt())
            {
                System.out.print("Give an integer sentinel value: "); 
                error = q.nextDouble();
            }
            else
            {
                Q = q.nextInt();
                enough = true;
            }
        }
        
        System.out.print("Enter a value, Q to quit: ");
        boolean done = false;
        while (!done && in.hasNextDouble())
        {
            value = in.nextDouble();
            if (value != Q)
            {
                sum = sum + value;
                count++;
                System.out.print("Enter a value, Q to quit: ");
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
