//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//HINT: Use a method of the Math class to get the absolute value of the parameter

//For the draft, print out the digits all on one line, separated by a space.
//Print zero at the end and return zero. If the input is 32677, the output will be

//3 2 6 7 7 0

//Print the sum of odd digits and return the sum. If the input is 32677, the output will be

//3 7 7
//17

public class MathUtil
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * @param n the number to use
    * @return the sum of the odd digits.
    */

   public int sumOfOdd(int n)
   {
       //TODO calculate and return the sum of the odd digits
       int count = 0;
       int sum = 0;
       while (Math.abs(n) > 0)
       {
           int digit = Math.abs(n) % 10;
           //System.out.print(digit + " ");
           if (digit % 2 == 1) //if the last digit is odd increment count by 1
           {
               sum = sum + digit;
               count++; //amount of times there is a odd digit in the number n
           }
           n = n / 10;
       }
       //System.out.print(sum);
       return sum;
       //return 0;
   }
}
