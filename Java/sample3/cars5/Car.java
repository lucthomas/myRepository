// BlueJ project: lesson3/cars5

// Complete the second constructor of this class.

public class Car
{
    private double milesDriven;
    private double gasInTank;
    private double milesPerGallon;
    private Picture pic;

    public Car(double mpg)
    {
        this.milesDriven = 0;
        this.gasInTank = 0;
        this.milesPerGallon = mpg;
        pic = new Picture("car.jpg");
        pic.draw();
    }

    public Car(double mpg, String pictureFile)
    {
        // TODO: Complete this constructor
        this.milesDriven = 0;
        this.gasInTank = 0;
        this.milesPerGallon = mpg;
        pic = new Picture(pictureFile);
        pic.draw();
    }

    public void drive(double distance)
    {
        this.milesDriven = this.milesDriven + distance;
        double gasConsumed = distance / this.milesPerGallon;
        this.gasInTank = this.gasInTank - gasConsumed;
        int pixelsPerMile = 10;
        pic.translate(distance * pixelsPerMile, 0);
    }

    public void addGas(double amount)
    {
        this.gasInTank = this.gasInTank + amount;
    }

    public double getMilesDriven()
    {
        return this.milesDriven;
    }

    public double getGasInTank()
    {
        return this.gasInTank;
    }
}
