// BlueJ project: lesson7/gallery1

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        // Create an empty array list or object gallery with elements of type/class Picture
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        // Add pictures to the array list
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
        // Draw pictures such that they are next to each other by 100 pixels horizontally (x,y) = (i*100,0)
        for (int i = 0; i < gallery.size(); i++)
        {
            Picture pic = gallery.get(i);
            pic.translate(i*100,0);
            pic.draw();
        }
    }
}
