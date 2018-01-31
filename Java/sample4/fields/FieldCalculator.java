public class FieldCalculator
{
    /**
     * Calculates the number of circular fields of Radius 400 meters
     * that can fit on a plot
     * of land if the first row starts all the way at the left, and
     * the second row starts one radius away from the left edge as
     * described in the question video, and the circles are as close
     * together as they can be without overlapping.
     */
    public int getNumberOfFields(int radius, int width, int length)
    {
        int diameter = 2 * radius;
        // YOUR CODE HERE
        // Use the equations from the last few questions
        // and the mathematical operations you've learned in this lesson
        // You've done an example by hand. Now code it up!
        int numberOfRows = (int) (Math.floor(1 + ((length - diameter)/(radius*Math.sqrt(3)))));
        int numberOfOddColumns = (int) (Math.floor(width/diameter));
        int numberOfEvenColumns = (int) (Math.floor((width - radius)/diameter));
        int numberOfOddRows;
        int numberOfEvenRows;
        
        if (numberOfRows%2 == 0)
        {
            numberOfOddRows = numberOfRows/2;
            numberOfEvenRows = numberOfRows/2;
        }
        else
        {
            numberOfOddRows = numberOfRows/2 + 1;
            numberOfEvenRows = numberOfRows/2;
        }
        
        int numberOfFields = (numberOfOddColumns*numberOfOddRows) + (numberOfEvenColumns*numberOfEvenRows);
        return numberOfFields;
    }
}
