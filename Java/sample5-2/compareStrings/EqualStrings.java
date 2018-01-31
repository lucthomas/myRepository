public class EqualStrings
{
    public static void main(String[] args)
    {
        String first = "Uda";
        String second = "city";
        String firstAndSecond = first + second;
        String third = "Udacity";
        /* 
         * It is very important to notice that == sign checks whether the Strings are at the same address.
         * This is not the case here since a new String object had to be made for "Uda" + "city".
         * Thus the address of the objects is different.
         * We actually don't care about the address but rather the content.
         * To focus on content only we need to use the equals method.
         * Example: firstAndSecond.equals(third)
         */
        if (firstAndSecond.equals(third))
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("firstAndSecond is "
                               + firstAndSecond);
        }
    }
}
