//hw04_07
/**
 * Complete the method below so that it returns the correct letter grade
 * for the number grade and return the letter grade as a string
 */
public class GradeBook
{
    /*
     * Gets the letter grade associated with this numeric grade
     * @param grade the numeric grade
     * @return the corresponding letter grade
     */

    public String getLetterGrade(int grade)
    {
        String lettergrade = "A";
        if(grade >= 90){lettergrade = "A";}
        else if(grade < 90 && grade >= 80){lettergrade = "B";}
        else if(grade < 80 && grade >= 70){lettergrade = "C";}
        else if(grade < 70 && grade >= 60){lettergrade = "D";}
        else{lettergrade = "F";}
        return lettergrade;
    }
}
