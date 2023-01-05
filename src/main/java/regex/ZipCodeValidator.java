package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipCodeValidator {
    public static boolean isZipValid(String zip){
        Pattern pattern = Pattern.compile("\\d\\d-\\d\\d\\d");
        Matcher matcher = pattern.matcher(zip);

        boolean matches = matcher.matches();
        System.out.println(matches);
        return matches;
    }
}
