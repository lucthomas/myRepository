// Complete the method in this class to return the first string that starts
// with the target. Return null if no string starts with the target.

import java.util.ArrayList;

public class StringFinder
{
    /**
     * Gets the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the first string starting with target or null if not found
     */
     public String getTarget(ArrayList<String> text, String target)
     {
         int i = 0;
         String startsWith = null;
         boolean found = false;
         while (!found && i < text.size()) //supply condition
         {
             //your code goes here
             String element = text.get(i);
             if(element.indexOf(target) == 0)
             {
                 startsWith = element;
                 found = true;
             }
             i++;
         }
         return startsWith;
     }
}
