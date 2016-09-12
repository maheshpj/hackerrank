package hackerrank.src.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
        String strToCheck = "The hackerrank team is on a mission to flatten the world by "
                + "restructuring the DNA of every company on the planet. We rank programmers "
                + "based on their coding skills, helping companies source great programmers "
                + "and reduce the time to hire. As a result, we are revolutionizing the way "
                + "companies discover and evaluate talented engineers. "
                + "The hackerrank platform is the destination for the best engineers "
                + "to hone their skills and companies to find top engineers."
                + " our email addresses are hacker_rank@gmail.com, hacker$rank@yahoo.in";
        // checker("hackerrank", strToCheck);

        // String emailRegex = "[A-Za-z0-9._$%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}";
        // StringMatcher(emailRegex, strToCheck);
        // checker("hackerrank", strToCheck);

        String html = "<p><a href='http://www.quackit.com/html/tutorial/html_links.cfm'>Example Link</a></p>";
        //String hrefRegex = "(?<=href\\=').+(?='>)";
        String hrefNameRegex = "<a.*a>";//"(?<=href\\=').+(?='>)";
        checker(hrefNameRegex, html);
    }

    public static void checker(String Regex_Pattern, String strToCheck) {
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(strToCheck);
        int Count = 0;
        while (m.find()) {
            Count += 1;
            if (m.group().length() > 0) {
                System.out.println("Match: " + m.group().trim());
            } 
        }
        System.out.format("Number of matches : %d", Count);
    }

    public static String StringMatcher(String regexPattern, String strToCheck) {
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(strToCheck);
        String match = "";
        while (m.find()) {
            if (m.group().length() > 0) {
                match = m.group().trim();
                System.out.println("Match: " + match);
            } else {
                System.out.println("No matches found.");
            }
        }
        return match;
    }
}
