public class ColorIntro
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(60, 90, 20, 30);
        Rectangle box2 = new Rectangle(80, 120, 20, 30);
        box.draw();
        box2.draw();

        box.setColor(new Color(255,0, 255));
        box.draw();
        box2.setColor(Color.MAGENTA);
        box2.fill();
    }
}
