package codeWar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(solution("samurai", "ai"));
        System.out.println(solution("sumo", "omo"));
        System.out.println(solution("ninja", "ja"));
        System.out.println(solution("sensei", "i"));
        System.out.println(solution("samurai", "ra"));
        System.out.println(solution("abc", "abcd"));
        System.out.println(solution("abc", "abc"));
        System.out.println(solution("abcabc", "bc"));
        System.out.println(solution("ails", "fails"));
        System.out.println(solution("fails", "ails"));
        System.out.println(solution("this", "fails"));
        System.out.println(solution("this", ""));
        System.out.println(solution(":-)", ":-("));
        System.out.println(solution("!@#$%^&*() :-)", ":-)"));
        System.out.println(solution("abc\n", "abc"));
    }

    public static boolean solution(String str, String ending) {
        return ending.length() > str.length() ? false : ending.equals(str.substring(str.length() - ending.length()));

    }

    public static boolean solutionCodeWar(String str, String ending) {
        return str.endsWith(ending);
    }
}
