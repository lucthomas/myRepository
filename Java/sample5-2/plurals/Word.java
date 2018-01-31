// Bluej project: plurals
public class Word
{
    private String letters;
    
    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
        
    }

    /**
       Tests whether the ith letter is a special letter.
       @param i the index of the letter to test
       @return true if the ith letter is special
    */
    public boolean isSpecial(int i)
    {
        return is(i, "o")
               || is(i, "s");
    }
    
    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the letter of all letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
    
    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        // TODO: Complete this method
        
        // You can use the
        // isVowel
        // isConsonant
        // is
        // isSpecial
        // methods from below.
        
        int lastIndex = letters.length() - 1;
   
        // If the word ends in y preceded by a vowel, you just add an s.
        // If the word ends in y preceded by a consonant, you just delete y and add ies.
        // You add an es when a word ends in o, or s, or sh, or ch.
        // In all the other case just add an s.
        if (isConsonant(lastIndex - 1) && is(lastIndex, "y"))
        {
            letters = letters.replace("y","ies");
        }
        else if (isSpecial(lastIndex))
        {
            letters = letters + "es";
        }
        else if (is(lastIndex, "h") && (is(lastIndex - 1, "c") || is(lastIndex - 1, "s")))
        {
            letters = letters + "es";
        }
        else
        {
            letters = letters + "s";
        }
        return letters;
    }
}
