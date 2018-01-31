// Bluej project: twitter
// TODO: Write code for the shorten(String longPost) method.
public class Twitterizer
{
    /**
     * Shortens and returns long posts by removing vowels
     * @param longPost the post whos vowels need to be removed
     * @return a version of the post without vowels
     */
    public String shorten(String longPost)
    {
        // YOUR CODE HERE
        String shortPost = "";
        String letter = "";
        for(int counter = 0; counter < longPost.length();counter++)
        {
            letter = longPost.substring(counter, counter + 1);
            // The contains method looks whether letter contains a vowel in lower case or upper case!
            if(!"oaeiuOAEIU".contains(letter)) 
            {
                shortPost = shortPost + letter;
            }
        }
        return shortPost;
    }
}
