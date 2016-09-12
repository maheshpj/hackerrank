package com.hackerrank.code;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < count; i++) {
			String s = sc.nextLine();

			String aRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
			SortedSet<String> matches = stringMatcher(aRegex, s);

			System.out.println(String.join(";", matches));
		}
		sc.close();
	}

	public static SortedSet<String> stringMatcher(String regexPattern,
			String strToCheck) {
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(strToCheck);
		String match = "";

		SortedSet<String> set = new TreeSet<String>();
		while (m.find()) {
			if (m.group().length() > 0) {
				match = m.group().trim();
				set.add(match);
			}
		}
		return set;
	}
}
