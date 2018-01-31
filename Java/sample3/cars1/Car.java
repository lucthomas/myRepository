public class Car
{
    private double milesDriven;
    private double gasInTank;
    private Picture pic;
    private double gasConsumed;
    
    public Car()
    {
        milesDriven = 0;
        gasInTank = 0;
        
        // Construct a picture
        pic = new Picture("car.jpg");
        pic.draw();
    }

    public void drive(double distance)
    {
        milesDriven = milesDriven + distance;
        
        double milesPerGallon = 50;
        gasConsumed = gasConsumed + distance/milesPerGallon;
        gasInTank = gasInTank - gasConsumed;
        
        double pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }

    public void addGas(double amount)
    {
        gasInTank = gasInTank + amount;
    }

    public double getMilesDriven()
    {
        return milesDriven;
    }
    
    public double getGasInTank()
    {
        return gasInTank;
    }
    
    public double getGasConsumed()
    {
        return gasConsumed;
    }
}
