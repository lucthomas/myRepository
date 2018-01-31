public class BookTester
{
    public static void main(String[] args)
    {
        Book alice = new Book("aliceInWonderland.txt");
        System.out.println(alice.getNumCharacters());
        System.out.println("Expected: 144331");
        System.out.println(alice.firstOccurrenceOfMadHatter());
        System.out.println("Expected: -1");
        
        System.out.println();
        System.out.println(alice.getFirstSentence());
        System.out.println();
        
        System.out.println();
        System.out.println(alice.getSecondSentence());
        System.out.println();
        
        System.out.println();
        System.out.println("Alice occurs " + alice.occurrencesOfAlice() + " times.");
        System.out.println();
        
        Book mary = new Book("mary.txt");
        System.out.println(mary.getNumCharacters());
        System.out.println("Expected: 475");
    }
}
