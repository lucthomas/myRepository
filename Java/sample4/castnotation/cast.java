
/**
 * The class cast shows how a double can be cast into an integer.
 * 
 * @author Luc Thomas 
 * @version 15/05/2016
 */
public class cast
{
   public static void main(String[] args)
   {
      double price = 4.35;
      // Here the double to the right handside is casted into the integer in the left handside
      int pennies = (int) Math.ceil(price*100);
      System.out.println(pennies);
   }
}
