// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The bottom left rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function

public class BlockTower
{
    public static void main(String[] args)
    {
        //TODO finish the draft to display the six blocks
        
        int[] x;
        x = new int[6];
        int[] y;
        y = new int[3];
        x[0] = 20;
        y[0] = 70;
        
        int w = 40;
        int h = 30;
        
        for(int i = 0;i<2;i++)
        {
            x[i + 1] = x[i] + w;
            x[i + 3] = (x[i] + x[i + 1])/2;
            y[i + 1] = y[i] - h;
        }
       
        x[5] = (x[3] + x[4])/2;
       
        Rectangle bluebox = new Rectangle(x[0],y[0],w,h);
        bluebox.setColor(Color.BLUE);
        bluebox.fill();
        
        Rectangle magbox = new Rectangle(x[1],y[0],w,h);
        magbox.setColor(Color.MAGENTA);
        magbox.fill();
        
        Rectangle cyanbox = new Rectangle(x[2],y[0],w,h);
        cyanbox.setColor(Color.CYAN);
        cyanbox.fill();
        
        Rectangle redbox = new Rectangle(x[3],y[1],w,h);
        redbox.setColor(Color.RED);
        redbox.fill();
        
        Rectangle pinkbox = new Rectangle(x[4],y[1],w,h);
        pinkbox.setColor(Color.PINK);
        pinkbox.fill();
        
        Rectangle cbox = new Rectangle(x[5],y[2],w,h);
        cbox.setColor(new Color(125,125,255));
        cbox.fill();
    }
}
