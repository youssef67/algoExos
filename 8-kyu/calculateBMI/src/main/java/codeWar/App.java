package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(bmi(80, 1.80));
    }

    public static String bmi(double weight, double height) {
        System.out.println( Math.pow(height, 2));



        double bmi = (weight / Math.pow(height, 2));
        System.out.println(bmi);

        if (bmi <= 18.5) return "Underweight";
        else if (bmi <= 25.0) return "Normal";
        else if (bmi <= 30.0) return "Overweight";
        else return "Obese";
    }
}
