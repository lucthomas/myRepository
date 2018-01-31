/**
 * equalNumbers compares the mathematical squareroot with a self-made one.
 * 
 * @author Luc Thomas 
 * @version 16/05/2016
 */
public class equalNumbers
{
    private final static double EPSILON = 1E-12;
    
    public static void main(String[] args)
    {
        double original = 2;
        double root = Math.sqrt(original);
        double rootSquared = root*root;
        if (Math.abs(rootSquared - original) < EPSILON)
        {
            System.out.println("They are the same!");
        }
        else
        {
            System.out.println("rootSquared is " + rootSquared);
        }
    }
}
