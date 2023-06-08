package jhtp.chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder stringBuilder = new StringBuilder("abdullah");

        // stringBuilder.setLength(5);
        System.out.println( stringBuilder.length());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.charAt(4));
        System.out.println(stringBuilder.reverse());
        String s = "Askjhnjkl";
        System.out.println(s.matches("[A-Z][A-Za-z]*"));

        Pattern pattern = Pattern.compile("A.*\\d[01]-\\d\\d");
        Matcher matcher = pattern.matcher("Abdullah 01-26");
            
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("No match found.");
        }
    }
}
