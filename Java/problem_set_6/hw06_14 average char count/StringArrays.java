// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
// Note that you want to keep the fractional part of the average
// Hint: If you do not know where to start, look at the ArrayList Algorithms to find
// an appropriate one.

import java.util.ArrayList;

public class StringArrays
{
    public double averageCountPerWord(ArrayList<String> words)
    {
        double average = 0;
        double count = 0.0; //defined as double so we do double division

        // TODO: Find the total number of characters in all the words
        
        // TODO: Calculate the average
        
        for(int i = 0 ; i < words.size() ; i++) //supply the condition
        {
            //your code here
            String word = words.get(i);
            count += word.length();
            
        }
        average = count / words.size();
        return average;
    }
}