// Bluej project: lesson6/counting_matches_digits
/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {
        // TODO: count and return the number of times the given digit appears in the number
        int count = 0;
        long temp = number;
        // Hint: The last digit is (int)(number % 10).
        while (temp > 0)
        {
            int digit = (int)(temp % 10); // last digit of number and conversion from long to int
            if (digit == digitToMatch)
            {
                count++;
            }
            temp = temp/10; // integer division
        }
        return count;
        // LEARNED LESSON: USE TEMP INSTEAD OF NUMBER TO ITERATE BECAUSE NUMBER CAN'T BE CHANGED AS IT IS STORED
        //IN THE MEMORY FOR THE LONG TERM AS IT IS INITIALIZED AS AN INSTANCE VARIABLE!!!
    }
}
