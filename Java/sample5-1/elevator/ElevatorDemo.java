import java.util.Scanner;

public class ElevatorDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();
        //Short version
        int actualFloor = floor;
        if (floor > 13)
        {
            actualFloor--;
        }
        //Long version
        //         int actualFloor;
        //         if (floor > 13)
        //         {
        //             actualFloor = floor - 1;
        //         }
        //         else
        //         {
        //             actualFloor = floor;
        //         }

        System.out.println("Actual floor: " + actualFloor);
    }
}