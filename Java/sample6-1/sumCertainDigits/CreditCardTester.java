public class CreditCardTester
{
    public static void main(String[] args)
    {
        SumEveryOtherDigit card = new SumEveryOtherDigit(12345);
        System.out.println("Actual: " + card.sumCertainDigits());
        System.out.println("Expected: 9");

        SumEveryOtherDigit anotherCard = new SumEveryOtherDigit(135792);
        System.out.println("Actual: " + anotherCard.sumCertainDigits());
        System.out.println("Expected: 12");
    }
}
