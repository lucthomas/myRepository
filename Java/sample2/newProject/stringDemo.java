public class stringDemo
{
    public static void main(String[] args)
    {
        String river = "Mississippi";
        int numberOfLetters = river.length();
        System.out.println(river);
        System.out.println(numberOfLetters);
        String newRiver = river.replace('i','x');
        System.out.println(newRiver);
        
    }
}
