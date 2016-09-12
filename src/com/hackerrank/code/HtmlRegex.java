package com.hackerrank.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlRegex {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int count = 1;//sc.nextInt();
        //sc.nextLine();
        for (int i = 0; i < count; i++) {
            //String s = sc.nextLine();
            // String s = "<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>";
            // String s = "<a href=\"http://www.hackerrank.com\"><h1><b>HackerRank</b></h1></a>";
            String s = "<li style=\"-moz-float-edge: content-box\">... that <a href=\"/wiki/Orval_Overall\" "
                    + "title=\"Orval Overall\"><h1><b>HackerRank</b></h1></a> <i>(pictured)</i> is the only <b>";

            String hrefRegex = "(?<=href\\=\")[^\"]*(?=\")";
            //String link = StringMatcher(hrefRegex, s);

            //String hrefNameRegex = "(?<=>)[^<>]+(?=</)";
            String hrefNameRegex = "(?<=<a.{0,100}>)((^<.*>)+?)(?=</a>)";
            String linkName = StringMatcher(hrefNameRegex, s);

            //System.out.println(link + "," + linkName);
        }
        //sc.close();
    }

    public static String StringMatcher(String regexPattern, String strToCheck) {
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(strToCheck);
        String match = "";
        while (m.find()) {
            if (m.group().length() > 0) {
                match = m.group().trim();
                System.out.println(match);
            }
        }
        return match;
    }
}
