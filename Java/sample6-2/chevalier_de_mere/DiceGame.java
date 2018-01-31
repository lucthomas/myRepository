// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        boolean hewins = false;
        for (int i = 0; i < 4; i++)
        {
             int value = 1 + generator.nextInt(6);
              // Return true if the chevalier wins (at least one is a 6).
             if (value == 6)
             {
                 hewins = true;
             }
        }
        return hewins;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        boolean hewins = false;
        for (int i = 0; i < 24; i++)
        {
            int firstValue = 1 + generator.nextInt(6);
            int secondValue = 1 + generator.nextInt(6);
            // Return true if at least one pair is both 6s.
            if (firstValue == 6 && secondValue == 6)
            {
                hewins = true;
            }
        }
        return hewins;
    }
}