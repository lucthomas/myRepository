
/**
 * Complete the method to return true if the parameter comes after "Udacity" in
 * lexicographic order
 */
/**
 * Strings > Comparing strings >
 *      StringLexicographicComparison.java
 *
 * Demonstrates how to compare strings with respect to lexicographic ordering.
 * For example, "slam" comes before "slat" in lexicographic ordering.  The
 * primary way to lexicographically compare strings is the .compareTo() method.
 * Consider the statement
 *
 *      a.compareTo(b)
 *
 * where a and b are both String objects.  The .compareTo() method returns
 *
 *      a negative value if a comes before b
 *      zero if a and b are equal
 *      a positive value if a comes after b
 */
public class Comparer
{
    /**
     * Determine if the string comes after "Udacity" in lexicographic order
     * @param string1 the first string
     * @return true if string1 comes after "Udacity' in lexicographic order.
     * Otherwise return false
     */

    public boolean comesAfter(String string1)
    {
        if(string1.compareTo("Udacity") > 0)
        {
            System.out.println("The input word comes AFTER Udacity in a lexicographical manner");
            return true;
        }
        else if(string1.compareTo("Udacity") < 0)
        {
            System.out.println("The input word comes BEFORE Udacity in a lexicographical manner");
            return false;
        }
        else // string1.compareTo("Udacity") == 0
        {
            System.out.println("The input word is EQUAL to Udacity in a lexicographical manner");
            return false;
        }
    }
}