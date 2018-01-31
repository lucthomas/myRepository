//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
        int product = 1;
        //TODO Write the code to return the product of all the numbers 1 to the parameter n (inclusive)
        for(int i = 2; i <= n; i++)
        {
            product = product*i;
        }
        return product;
   }
}
