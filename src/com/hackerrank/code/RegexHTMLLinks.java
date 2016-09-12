package com.hackerrank.code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHTMLLinks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			String s = sc.nextLine();

			String aRegex = "(?i)<a([^>]+)>(.*?)</a>";
			stringMatcher(aRegex, s, true);
		}
		sc.close();
	}

	public static String stringMatcher(String regexPattern, String strToCheck,
			boolean parent) {
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(strToCheck);
		String match = "";
		while (m.find()) {
			if (m.group().length() > 0) {
				match = m.group().trim();
				if (parent)
					print(match);
			}
		}
		return match;
	}

	private static void print(String match) {
		String hrefRegex = "(?<=href\\=\")[^\"]*(?=\")";
		String link = stringMatcher(hrefRegex, match, false);

		String hrefNameRegex = "(?<=>)[^<]*(?=(</))";
		String linkName = stringMatcher(hrefNameRegex, match, false);
		
		if(!(link.isEmpty() && linkName.isEmpty()))
			System.out.println(link + "," + linkName);
	}
}
