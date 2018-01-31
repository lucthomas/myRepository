//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that 
//takes the width and length in feet as arguments:
//public YardCalculator(double length, double width)

//Provide methods:
//  public double perimeter() which returns the perimeter in meters
//  public double area() which returns the area in square meters
//  public double diagonal() which returns the diagonal in meters

//For reference:
//  1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it, e.g.
//  public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin. 

public class YardCalculator
{
    //Instance variables go here.
    private double width;
    private double length;
    
    public static final double METERS_PER_FOOT = 0.3048;
    
    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard in feet
     * @param theWidth the width of the yard in feet
     */
    public YardCalculator(double theLength, double theWidth)
    {
        //Conversion from feet to meters
        this.width = theWidth*METERS_PER_FOOT;
        this.length = theLength*METERS_PER_FOOT;
    }

    /**
     * Gets the perimeter of the yard
     * @return the perimeter in meters
     */
    public double perimeter()
    {
        double p = 2*this.width + 2*this.length;
        return p;
    }

    /**
     * Gets the area of the yard
     * @return the area in 
     */
    public double area()
    {
        double a = this.width * this.length;
        return a;
    }

     /**
     * Gets the diagonal of the yard
     * @return the diagonal in meters
     */
    public double diagonal()
    {
        double d = Math.sqrt(Math.pow(this.width,2) + Math.pow(this.length,2));
        return d;
    }

}
