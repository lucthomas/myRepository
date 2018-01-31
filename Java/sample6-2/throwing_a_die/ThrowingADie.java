// lesson6/throwing_a_die
// A program that simulates tossing a die 100 times. 
// It prints the number of times you roll a 6. 

import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        // This line nitializes the generator and gives it 42 as a "seed." 
        // The generator will generate a sequence of numbers that
        // look random, but if you create another generator and seed 
        // it with 42, it will generate the same sequence. 
        // DO NOT CHANGE THIS LINE
        Random generator = new Random(42);
        
        // YOUR CODE HERE
        // Use a loop to roll a die 100 times.
        final int TIMES_ROLL_DICE = 100;
        // Count how many sixes you see, and print the number of
        // 6's at the end.
        int countSix = 0;
        for (int count = 0; count < TIMES_ROLL_DICE; count++)
        {
            int faceOfDice = 1 + generator.nextInt(6);
            if (faceOfDice == 6)
            {
                countSix++;
            }
        }
        System.out.printf("%d sixes were being count after rolling the dice %d times",countSix,TIMES_ROLL_DICE);
    }
}
