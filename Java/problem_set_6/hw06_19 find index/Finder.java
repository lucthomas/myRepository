// Complete the method in this class to return the index of the first string
// that starts with the target. Return -1 if no string starts with the target

import java.util.ArrayList;

public class Finder
{
    /**
     * Gets the index of the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the index of first string starting with target or -1 if not found
     */
     public int getIndex(ArrayList<String> text, String target)
     {
         int i = 0;
         int index = -1;
         int elementIndex = -1;
         boolean found = false;
         while (!found && i < text.size()) //supply condition
         {
             // TODO: Adapt an ArrayList algorithm to return the index of the first
             // string that start with the target
             // TODO: Return -1 if no string starts with the target
             String element = text.get(i);
             elementIndex = element.indexOf(target);
             if(elementIndex != -1)
             {
                 found = true;
                 index = text.indexOf(element);
             }
             i++;
         }
         return index;
     }
}