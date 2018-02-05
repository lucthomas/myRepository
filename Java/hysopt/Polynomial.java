import java.util.Scanner;
/**
 * Opdracht Hysopt
 * 
 * Gegeven: 1-dimensionale veelterm onder de vorm ax^0 + bx^1 + ... + zx^m
 * 
 * Gevraagd:
 * 
 * - Schrijf een functie derive() die de n-de afgeleide neemt van de veelterm (vul de klasse aan waar nodig)
 * 
 * - Welke data-structuur zou je gebruiken om de veelterm voor te stellen?
 *   De voorstelling van de veelterm kan best gedaan worden met de String data-structuur
 *   De coefficiënten van de veelterm kunnen geplaatst worden in een integer array en behoren tot de verzameling der gehele getallen
 *   De graad van de veelterm is een integer en behoort tot de verzameling der natuurlijke getallen
 *   
 * - Wat als we hoge exponenten zouden willen aankunnen?
 *   Indien we hoge exponenten willen aankunnen, kunnen we kiezen voor een long data-structuur voor de graad en exponent m. 
 * 
 * - Verandert er iets als 'n' heel hoog kan zijn?
 *   Als n zeer groot is, kunnen de coefficiënten zeer groot worden. Het is dan mogelijk dat de coefficiënten het maximum 2^31 - 1 overschreiden (int: 32-bit integer).
 *   In dat geval is het beter om te kiezen voor een long[] data-structuur (long: 64-bit integer - maximum: 2^63 - 1).
 *   Indien n zelf zeer groot is, kan men n initialiseren als een long data-structuur.
 * 
 * @author Luc Thomas
 * @version v0.1 04-02-2018
 * 
 */

public class Polynomial
{
    private int[] coeff; // coefficiënten van de veelterm
    private int graad; // graad van de veelterm
    
    Scanner input = new Scanner(System.in);
    
    /**
     * Initialisatie van een nieuwe 1-dimensionale veelterm onder de vorm am.x^m + ... + a1.x^1 + a0 
     * @param m het hoogst mogelijke exponent van de veelterm
     * @param voa staat voor 'veelterm of afgeleide veelterm - voa = 0 komt overeen met de veelterm en voa = 1 met de n-de afgeleide veelterm
     * @throws IllegalArgumentException als {@code m} negatief is
     */
    public Polynomial(int m, int voa)
    {
        if(m < 0) {
                throw new IllegalArgumentException("Het exponent mag niet negatief zijn: " + m);
            }
            
        if(voa != 0 && voa != 1) {
             throw new IllegalArgumentException("voa mag zich niet buiten {0,1} bevinden: " + voa);
        }
        
        else if(voa == 0) {
            System.out.println("De veelterm is geschreven onder de vorm am.x^m + ... + a1.x^1 + a0");
            System.out.println("Het hoogst mogelijke exponent m van deze veelterm is: " + m);
            coeff = new int[m+1]; // voorbeeld: stel m = 2, dan maken we voor coefficiënten een nieuwe array van integers van grootte 3 met indexen 0,1 en 2
            System.out.println("Deze veelterm bevat " + coeff.length + " coefficiënten");
            for(int i = 0; i < coeff.length; i++) {
                System.out.println("Gelieve voor deze veelterm de coefficiënt met index " + i + " in te geven:");
                coeff[i] = input.nextInt();
            }
            this.simplify();
            System.out.println("De voorstelling van de veelterm is: " + this.toPolynomialString());
        }
        
        else if(voa == 1) {
            coeff = new int[m+1];
        }
    }
    
    /**
     * Methode
     * 
     * Vereenvoudig de veelterm door leidende termen met coefficiënten met waarde nul weg te laten
     */
    private void simplify()
    {
        graad = -1;
        for(int i = coeff.length - 1; i >= 0; i--) {
            if(coeff[i] != 0) {
                graad = i;
                return; // We behouden de graad zodra één van de leidende coefficiënten niet nul is
            }
        }
    }
    
    /**
     * Methode
     * 
     * Voorstelling van de veelterm met string data-type onder de vorm am.x^m + ... + a1.x^1 + a0
     * @return voorstelling van de veelterm met string data-structuur onder de vorm am.x^m + ... + a1.x^1 + a0
     */
    public String toPolynomialString()
    {
        if(graad == -1) {
            return "0";
        }
        else if(graad == 0) {
            return "" + coeff[0]; // Gebruik "" om een string te kunnen teruggeven
        }
        else if(graad == 1) {
            return coeff[1] + ".x + " + coeff[0];
        }
        
        String v = coeff[graad] + ".x^" + graad; // Na de simplify() methode is de graad van de veelterm bekend bij dewelke de coefficiënt verschillend is van nul
        for(int i = graad - 1; i >= 0; i--)
        {
            if (coeff[i] == 0) {
                continue; // Indien de coefficiënt met index i nul is, herstarten we de for-loop
            }
            else if(coeff[i] > 0) {
                v = v + " + " + coeff[i];
            }
            else if(coeff[i] < 0) {
                v = v + " - " + (-coeff[i]);
            }
            
            if(i > 1) {
                v = v + ".x^" + i;
            }
            else if(i == 1) {
                v = v + ".x";
            }
        }
        return v;
    }
    
    /**
     * Methode 
     * 
     * De eerste afgeleide van de veelterm
     * @return     de eerste afgeleide van de veelterm
     */
    public Polynomial diff()
    {
        if(graad == 0) {
            Polynomial zero = new Polynomial(0,1);
            zero.coeff[0] = 0;
            return zero;
        }
        Polynomial afgeleide = new Polynomial(graad - 1,1);
        for(int i = 0; i <= graad - 1; i++) {
            afgeleide.coeff[i] = (i + 1)*coeff[i + 1];
        }
        afgeleide.simplify();
        return afgeleide;
    }
    
    /**
     * Methode 
     * 
     * De n-de afgeleide van de veelterm
     * @param n    het aantal keer dat een veelterm wordt afgeleid
     * @return     de n-de afgeleide van de veelterm
     */
    public Polynomial derive(int n)
    {
        int j = 1;
        Polynomial nde_afgeleide = this;
        while(j <= n) {
            nde_afgeleide = nde_afgeleide.diff();
            System.out.println("De voorstelling van afgeleide " + j + " is: " + nde_afgeleide.toPolynomialString());
            j = j + 1;
        }
        return nde_afgeleide;
    }
    
    /**
     * Methode 
     * 
     * Het beeld van de veelterm p
     * @param x    het gekozen bereik van de veelterm p
     * @return     het berekende beeld van de veelterm p
     */
    public int calculate(int x)
    {
        int p = 0;
        for(int i = 0; i <= graad; i++) {
            p += coeff[i] * (int)(Math.pow(x,i));
        }
        System.out.println("Het beeld van de veelterm voor gekozen bereik " + x + " is: " + p);
        return p;
    }
    
    /**
     * Test de veelterm en zijn afgeleiden
     *
     * @param args argumenten ingegeven in de CLI
     */
    public static void main(String[] args) { 
        Polynomial veelterm = new Polynomial(3,0);
        veelterm.calculate(6);
        veelterm.derive(1).calculate(2);
    }
}
