// BlueJ project: lesson4/turningMathToJava
// Video: Arithmetic Operations 2

// TODO: The amdahlSpeedup, crossRatio and average methods
// aren't working yet. Use the fact sheet and your new 
// knowledge of math expressions in java to fix these methods. 

public class MathInJava
{
    /*
       Computes the fraction

           1
      -----------
           1 - s
       s + -----
             n

      See http://en.wikipedia.org/wiki/Amdahl%27s_law
    */
    public double amdahlSpeedup(double s, double n)
    {
        // To do!
        double x = 0;
        x = 1/(s+((1-s)/n));
        return x;
    }

    /*
      Computes the fraction

      (a - c)(b - d)
      --------------
      (b - c)(a - d)

      See http://en.wikipedia.org/wiki/Cross-ratio
    */
    public double crossRatio(double a, double b, double c, double d)
    {
        // To do!
        double y = 0;
        y = ((a-c)*(b-d))/((b-c)*(a-d));
        return y;
    }

    /**
      Computes the average of four values.
      @param a the first value
      @param b the second value
      @param c the third value
      @param d the fourth value
      @return the average of the four values
    */
    public double average(double a, int b, int c, int d)
    {
        // To do!
        double z = 0;
        // Here the computer will read this as an integer division.
        // In order to make this a regular division one of the arguments must be a double:
        // either change 4 to 4.0 or the a,b,c or d to a double. I changed a to a double data type.
        z = (a+b+c+d)/4;
        return z;
    }
}