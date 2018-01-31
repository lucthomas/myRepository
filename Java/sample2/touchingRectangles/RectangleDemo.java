
// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        int x = 60;
        int y = 90;
        int w = 20;
        int h = 30;
        
        Rectangle box = new Rectangle(x,y,w,h);
        Rectangle box2 = new Rectangle(x+w,y+h,w,h);
        
        box.draw();
        box2.draw();
        
        Color red = new Color(255,0,0);
        Color green = new Color(0,255,0);
        
        box.setColor(red);
        box.draw();
        
        box2.setColor(green);
        box2.fill();
    }
}
