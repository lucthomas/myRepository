//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January, 2 for February and so forth)
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1

//And 2 methods
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. Use Boolean operators (&&, ||, !).
//       You will have an if then else if then else.
//       For February return 28
//
//These are implemented for you as stubs

//For the draft:
//In Month, provide the constructor and the instance variable.

public class Month
{
    //instance variables
    private int monthNumber;
    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int theMonthNumber)
    {
        this.monthNumber = theMonthNumber;
        if(monthNumber < 1 || monthNumber > 12)
        {
            monthNumber = 1;
        }
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
        String monthName = "";
        if (monthNumber == 1)
        {
            monthName = "January";
        }
        else if (monthNumber == 2)
        {
            monthName = "February";
        }
        else if (monthNumber == 3)
        {
            monthName = "March";
        }
        else if (monthNumber == 4)
        {
            monthName = "April";
        }
        else if (monthNumber == 5)
        {
            monthName = "May";
        }
        else if (monthNumber == 6)
        {
            monthName = "June";
        }
        else if (monthNumber == 7)
        {
            monthName = "July";
        }
        else if (monthNumber == 8)
        {
            monthName = "August";
        }
        else if (monthNumber == 9)
        {
            monthName = "September";
        }
        else if (monthNumber == 10)
        {
            monthName = "October";
        }
        else if (monthNumber == 11)
        {
            monthName = "November";
        }
        else
        {
            monthName = "December";
        }
        return monthName;
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
        int numberDays = 0;
        if (monthNumber == 1
            || monthNumber == 3
            || monthNumber == 5
            || monthNumber == 7
            || monthNumber == 8
            || monthNumber == 10
            || monthNumber == 12)
        {
            numberDays = 31;
        }
        else if (monthNumber == 2)
        {
            numberDays = 28;
        }
        else
        {
            numberDays = 30;
        }
        return numberDays;
    }
}
