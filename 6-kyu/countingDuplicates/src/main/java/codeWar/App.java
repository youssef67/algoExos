package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(duplicateCount(""));
    }

    public static int duplicateCount(String text) {
        String textToLowerCase = text.toLowerCase();
        int nbrRepeat = 0;

        while (textToLowerCase.length() > 0) {
            int lengthTextBeforeSplit = textToLowerCase.length();

            textToLowerCase = textToLowerCase.replace(Character.toString(textToLowerCase.charAt(0)), "");
            int lengthTextAfterSplit = textToLowerCase.length();

            if (lengthTextBeforeSplit - lengthTextAfterSplit >= 2) {
                nbrRepeat++;
            }
        }



        return nbrRepeat;
    }
}
