
/**
 * Check wheter exactlyOneThree can be found.
 * 
 * @author Luc Thomas
 */
public class exactlyOneThree
{
    // There are two manners to do this:
    // (x == 3 ^ y == 3) --> use the XOR operator
    // ((x == 3 && y != 3)||(x != 3 && y == 3)) --> use AND, OR and NOT operators
    private int x;
    private int y;

    /**
     * Constructor for objects of class exactlyOneThree
     */
    public exactlyOneThree()
    {
        // initialise instance variables
        x = 0;
        y = 0;
    }

    /**
     * Method looks whether we have exactly one dice with a three on it
     * 
     * @param  y   a dice number
     * @param  x   a dice number 
     */
    public void exactlyOneThree(int x, int y)
    {
        // put your code here
        if (x == 3 ^ y == 3)
        {
            System.out.println("We have exactly one three");
        }
        else
        {
            System.out.println("We don't have exactly one three");
        }
    }
}
