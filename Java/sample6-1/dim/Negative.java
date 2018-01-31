// Bluej project: negative

public class Negative
{
    // Instance variables
    private Picture pic;
    // Constructor
    public Negative(Picture pic)
    {
        this.pic = pic;
    }
    // Create a negative method
    /**
     * Method to make the negative of a picture.
     *
     * @param picture 
     */
    public Picture getNegative()
    {
        for(int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            Color negative = new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
            pic.setColorAt(i, negative);
        }
        return pic;
    }
}
