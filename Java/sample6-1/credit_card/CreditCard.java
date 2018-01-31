// Bluej project: lesson6/credit_card
// Video: Credit Card Checksum

// TODO: Implement the isValid method.
public class CreditCard
{
    private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates whether this CreditCard has a valid number.
     * @return true if the number is valid, false if it's not.
     */
    public boolean isValid()
    {
        /* Pseudocode for isValid:
         * sum = 0
         * count = 0
         * for each digit starting from the right
         *     count ++
         *     if count is odd
         *         sum = sum + digit
         *     else if (digit < 5)
         *         sum = sum + 2 * digit
         *     else
         *         sum = sum + 2 * digit - 9
         * if the last digit of the sum is zero
         *     The card number is valid
         */
        long n = cardNumber;
        int sum = 0;
        int count = 0;
        
        while (n > 0)
        {
            int digit = (int)(n % 10); // This piece of code stores the first digit starting from the right into digit.
            count++;
            if (count % 2 == 1)
            {
                sum = sum + digit;
            }
            else if (digit < 5)
            {
                sum = sum + 2*digit;
            }
            else
            {
                sum = sum + 2*digit - 9;
            }
            n = n/10; // This piece of code deletes the first digit starting from the right.
        }
        
        //Long version
        
        //int lastDigitOfSum = (int)(sum % 10);
        //boolean valid = false;
        //if (lastDigitOfSum == 0)
        //{
        //    valid = true;
        //}
        //return valid;
        
        //Short version
        
        return sum % 10 == 0;
        
    }
}
