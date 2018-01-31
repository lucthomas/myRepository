import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a word and press enter and I'll tell you how many times it appears in \n"
        + "Alice in Wonderland: ");
        String word = in.next();
        
        //When having spaces in the text from whom occurrences need to be checked, then it is important to use the 
        //in.nextLine() command since in.next() can't read the spaces!
        //String sentence = in.nextLine();
        
        System.out.println();
        
        Book aliceInWonderland = new Book("aliceInWonderland.txt");
        int occurrences = aliceInWonderland.occurrencesOf(word);
        //int occurrences = aliceInWonderland.occurrencesOf(sentence);
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}
