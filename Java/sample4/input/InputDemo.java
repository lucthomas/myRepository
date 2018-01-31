import java.util.Scanner;

public class InputDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your weight in kg? ");
        double weight = in.nextDouble();

        System.out.print("What is your height in cm? ");
        int height = in.nextInt();
        
        int BMI = (int)(weight/Math.pow(height,2)*10000);
        
        if (BMI < 18)
        {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You need to eat some muffins now!");
        }
        else if (BMI > 25)
        {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You better lose some weight you fat fuck!");
        }
        else
        {
            System.out.println("Your BMI is: " + BMI);
            System.out.println("You look great! Keep on the good work!");
        }
    }
}
