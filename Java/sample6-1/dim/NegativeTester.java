
public class NegativeTester
{
    public static void main(String[] args)
    {
        Picture mary = new Picture("queen-mary.png");
        mary.draw();
        mary.pause();
        
        Negative negMary = new Negative(mary);
        negMary.getNegative();
        
    }
}
