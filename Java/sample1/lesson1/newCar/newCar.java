
/**
 * newCar calculates the total cost of two cars and tells the user which car he/she should buy .
 * 
 * @author Luc Thomas
 * @version 1 on 06/05/2016
 */
public class newCar
{
// declaration and initialization of variables
    
    // declare and assign fuel cost ($/gallon)
    private int carFuelCost = 4;
    // declare and assign distance (miles)
    private int distance = 50000;
    // declare and assign price of the first car ($)
    private int firstCarPrice = 15000;
    // declare and assign distance per gallon of fuel of the first car (miles per gallon)
    private int mpgFirstCar = 10;
    // declare and assign price of the second car ($)
    private int secondCarPrice = 30000;
    // declare and assign distance per gallon of fuel of the second car (miles per gallon)
    private int mpgSecondCar = 50;
    
    // declare the total actual car cost x variable
    private int x;
    
    // declare the total cost of the first and second car variables
    private int totalCost1;
    private int totalCost2;
    
    // make a no-argument constructor
    public newCar()
    {
        totalCost1 = totalActualCarCost(distance, mpgFirstCar, carFuelCost, firstCarPrice);
        totalCost2 = totalActualCarCost(distance, mpgSecondCar, carFuelCost, secondCarPrice);
        //System.out.println(totalCost1);
        //System.out.println(totalCost2);
        
        if (totalCost1 > totalCost2)
        {
            System.out.println("The second car is cheaper than the first one!");
        }
        else if(totalCost1 == totalCost2)
        {
            System.out.println("Both cars cost the same!");
        }
        else
        {
            System.out.println("The first car is cheaper than the second one!");
        }
    }
    
    public static void main(String[] args)
    {
       // make space in memory for the newCar() constructor
       newCar Luko = new newCar();
    }
    
    /**
     * Method to calculate the total cost of a car
     * 
     * @param d is an integer for the distance travelled by car
     * @param mpg is the miles per gallon covered
     * @param ppg is the price per gallon 
     * @param bp is the buy price of the car
     * 
     * @return     x
     */
    public int totalActualCarCost(int d, int mpg, int ppg, int bp)
    {
        x = (d/mpg)*ppg + bp;
        return x;
    }
}
