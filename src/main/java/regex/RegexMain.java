package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(1Mic)");
        Matcher matcher = pattern.matcher("1Michal");

        boolean matches = matcher.find();
        System.out.println(matches);
    }
}
