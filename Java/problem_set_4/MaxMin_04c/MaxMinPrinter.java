//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 11 3 8 1, 2 9, the output will be

//11
//2

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to Integer.MAX_INTEGER before the loop.

//For the draft, ask the user to input a series of integers, printing each one. Terminate when the user enters any non-integer. Do not let your code throw an exception (terminate with an error)

//The dialog for the draft would be:

//Enter an integer: 5
//  5
//  Enter an integer: 10
//  10
//  Enter an integer: 3
//  3
//  Enter an integer: 8
//  8
//  Enter an integer: 1
//  1
//  Enter an integer: 2
//  2
//  Enter an integer: 9
//  9
//  Enter an integer: x

import java.util.Scanner;
public class MaxMinPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       //Integer is actually a java Class and MAX_VALUE is a constant holding the maximum value an int can have, 2^31 - 1
       //MIN_VALUE is a constant holding the minimum value an int can have, -2^31
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       System.out.print("Enter an integer: ");
       while (in.hasNextInt())
       {
           int value = in.nextInt();
           if (min > value)
           {
               min = value;
           }
           if (max < value)
           {
               max = value;
           }
           System.out.print("Enter an integer: ");
       }
       System.out.println(max);
       System.out.println(min);
   }
}
