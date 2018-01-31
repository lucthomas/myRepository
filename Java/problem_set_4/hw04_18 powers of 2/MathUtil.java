
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{

   public int largestPowerOf2(int n)
   {
       int i = 0;
       while(Math.pow(2,i) < n)
       {
           i++;
       }
       int result = (int)(Math.pow(2,i-1));
       return result;
   }

}