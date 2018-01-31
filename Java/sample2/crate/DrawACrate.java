//import javafx.scene.text.*;
// BlueJ project: lesson2/crate

// Draw a crate by combining a rectangle with five lines.
//
// The front face is a rectangle with top left corner (20, 30), 
// width 100, and height 40. 
//
// A diagonal line goes from the face's top left corner  to (50, 10). 
// Another diagonal line goes from the face's bottom right corner 
// to (150, 50).
// A third diagonal starts at the face's top right corner and is
// parallel to the others.
// The fourth and fifth line join the end points of the diagonals.
//
// Before programming, get out a pen and draw the crate on a
// sheet of paper! Label each of the points with their coordinates.
//
// Also, don't forget to call draw() on your rectangle and line objects.

public class DrawACrate
{
    
 
    public static void main(String[] args)
    {
        int recx = 20;
        int recy = 30;
        int recw = 100;
        int rech = 40;
    
        int line1X2 = 50;
        int line1Y2 = 10;
    
        int line2X2 = 150;
        int line2Y2 = 50;
        
        Rectangle face = new Rectangle(recx,recy,recw,rech);
        face.draw();
        
        Line line1 = new Line(recx,recy,line1X2,line1Y2);
        line1.draw();
        
        Line line2 = new Line(recx+recw,recy+rech,line2X2,line2Y2);
        line2.draw();
        
        Line line3 = new Line(recx+recw,recy,line2X2,line1Y2);
        line3.draw();
        
        Line uline = new Line(line1X2,line1Y2,line2X2,line1Y2);
        uline.draw();
        
        Line sline = new Line(line2X2,line1Y2,line2X2,line2Y2);
        sline.draw();
        
        // TODO: Write TOP SECRET on the front face of the box.
        // The top left corner of the front face should be the
        // same as the top left corner of the text.
        
        //Text topsecret = new Text(20,30,"TOP SECRET");
        //topsecret.draw();
    }
}
