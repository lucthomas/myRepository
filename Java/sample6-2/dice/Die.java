// BlueJ project: lesson6/dice

// In the cast method, call the nextInt method and return a
// random value between 1 and sides

import java.util.Random;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die
{
    private Random generator;
    private int sides;

    /**
       Constructs a die with a given number of sides.
       @param s the number of sides, e.g. 6 for a normal die
    */
    public Die(int s)
    {
        this.sides = s;
        final int SEED = 42;
        generator = new Random(SEED); // The seed is the initial value of the generator
    }

    /**
       Simulates a throw of the die
       @return the face of the die
    */
    public int cast()
    {
        // TODO: Complete this method 
        // When using nextInt(int n) method on generator a random integer value between 0 (inclusive) and n (exclusive) is being made.
        // Thus, in order to generate values between 0 (exclusive) and n (inclusive) we need to add 1 to the object generator!
        int faceOfDie = 1 + generator.nextInt(sides);
        return faceOfDie;
    }
}
