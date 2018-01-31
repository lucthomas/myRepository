// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        //for (Picture pic : gallery) // This is the 'enhanced for loop'!!! It goes through each element of ArrayList gallery and assigns it the variable name pic!
        //{
            // TODO: Move the first picture to offset 10,
        //    pic.translate(10,0);
            // the second picture ten pixels to the right of the first one,
            // and so on
        //    if (gallery.indexOf(pic) > 0)
        //    {
        //        int prevPicIndex = gallery.indexOf(pic) - 1;
        //        Picture prevPic = gallery.get(prevPicIndex);
        //        int prevPicMaxX = prevPic.getMaxX();
        //        pic.translate(prevPicMaxX,0);
        //    }
        //}

        //for (Picture pic : gallery)
        //{
        //    pic.draw();
        //}
        
        // Placing the above two enhanced for loops in 1 single enhanced for loop!!!
        
        int rightMostX = 0;
        for (Picture pic: gallery)
        {
            pic.translate(rightMostX + 10,0);
            pic.draw();
            rightMostX = pic.getMaxX();
        }
    }
}
