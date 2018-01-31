
/**
 * The numbers class multiplies oneMillion*oneMillion.
 * 
 * @author Luc Thomas 
 * @version 1 15/05/2016
 */
public class numbers
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class numbers
     */
    public static void main(String[] args)
    {
        // When using integers (32 bits or 4 bytes memory) you will have overflow as you'll go over
        // the max. allowable number (~2 Billion).
        
        // The remedy is to use double data type such that scientific notation becomes possible.
        double oneMillion = 1000000.0;
        double mystery = oneMillion*oneMillion;
        System.out.println(mystery);
        
        // TEST: dividing pennies by ten is not the supposed 43.5, but rather 43. The rest can be 
        // found via an other operator % which allows to find the rest
        int pennies = 435;
        int dollarsTimesTen = pennies/10;
        System.out.println(dollarsTimesTen);
        
        // restPennies is here 435 - 43*10 = 5
        int restPennies = pennies%10;
        System.out.println(restPennies);
    }
}
