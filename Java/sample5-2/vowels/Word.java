// BlueJ project: lesson5/vowels

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        // TODO: Complete this method
        // A little piece of code to get you started
        String letter = this.letters.substring(i, i + 1);
        boolean aVowel = letter.equals("a");
        boolean oVowel = letter.equals("o");
        boolean uVowel = letter.equals("u");
        boolean eVowel = letter.equals("e");
        boolean iVowel = letter.equals("i");
        boolean vowels;
        vowels = aVowel||oVowel||uVowel||eVowel||iVowel;
        return vowels;
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        // TODO: Complete this method
        
        // Long version!
        // boolean aVowel = this.letters.substring(i, i + 1).equals("a");
        // boolean oVowel = this.letters.substring(i, i + 1).equals("o");
        // boolean uVowel = this.letters.substring(i, i + 1).equals("u");
        // boolean eVowel = this.letters.substring(i, i + 1).equals("e");
        // boolean iVowel = this.letters.substring(i, i + 1).equals("i");
        // boolean consonant;
        // consonant = !aVowel && !oVowel && !uVowel && !eVowel && !iVowel;
        // return consonant;
        
        // Much shorter!
        return !isVowel(i);
    }
}

