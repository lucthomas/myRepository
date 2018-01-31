// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
        int diameter = 2 * radius;
 
        int numberOfRows = (int) (Math.floor(1 + ((this.length - diameter)/(radius*Math.sqrt(3)))));
        int numberOfOddColumns = (int) (Math.floor(this.width/diameter));
        int numberOfEvenColumns = (int) (Math.floor((this.width - radius)/diameter));
        
        // It is also possible to program this without if statement by adding 1 to numberOfRows before
        // division by 2. Why? Well, it can best be explained by an example: 6/2 = 3 and (6+1)/2 = 3 in Java
        // since this is an integer division and finally (7+1)/2 = 4.
        
        int numberOfOddRows = (numberOfRows + 1)/2;
        int numberOfEvenRows = numberOfRows/2;
        
        int numberOfFields = (numberOfOddColumns*numberOfOddRows) + (numberOfEvenColumns*numberOfEvenRows);
        
        return numberOfFields;
    }
}
