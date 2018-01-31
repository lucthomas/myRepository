//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//  void addAir(double amount) adds the given amount of air
//  double getVolume() gets the current volume
//  double getSurfaceArea() gets the current surface area
//  double getRadius() gets the current radius

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on 
// how to begin. 

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//  You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//  You will need to solve the volume formula for radius.

/**
 * models a spherical balloon that is being filled with air
 *
 * @author Luc Thomas
 */
public class Balloon
{
    private double volume;
    private double radius;
    
    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        volume = 0;
    }
    
    /**
     * Adds an amount of air to the balloon
     *
     * @param amount        the amount of air added to this balloon
     */
    public void addAir(double amount)
    {
        // Code here!
        volume += amount;
    }
    
    /**
     * Gets the radius of the Balloon
     *
     * @return radius       the radius of this balloon
     */
    public double getRadius()
    {
        // Code here!
        radius = Math.pow(volume/(Math.PI*(4.0/3)),(1.0/3));
        return radius;
    }
    
    /**
     * Gets the surface area of the balloon
     *
     * @return surface      the surface of this balloon
     */
    public double getSurfaceArea()
    {
        // Code here!
        double surface = 4*Math.PI*Math.pow(radius,2);
        return surface;
    }
    
    /**
     * Gets the volume of the Balloon
     *
     * @return volume       the volume of this balloon
     */
    public double getVolume()
    {
        // Code here!
        return volume;
    }
}
