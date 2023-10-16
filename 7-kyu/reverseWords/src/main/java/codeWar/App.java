package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(reverseWordsCodeWar("The quick brown fox jumps over the lazy dog."));
    }

    /*public static String reverseWords(final String original) {

        if(original.isBlank())
            return original;

        String[] originalArr = original.split(" ");
        StringBuilder originalReverve = new StringBuilder();

        for (String w : originalArr) {
            StringBuilder word = new StringBuilder();
            originalReverve.append(word.append(w).reverse() + " ");
        }

        return originalReverve.toString().trim();
    }*/

    public  static String reverseWordsCodeWar(final String original) {

        String[] originalArr = original.split(" ");

        if(originalArr.length == 0)
            return original;

        int i = 0;
        for (String w : originalArr) {
            originalArr[i] = new StringBuilder(w).reverse().toString();
            i++;
        }

        return String.join(" ", originalArr);
    }
}
