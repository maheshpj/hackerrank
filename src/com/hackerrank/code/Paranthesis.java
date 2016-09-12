package com.hackerrank.code;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Paranthesis {
	
	
	public static void main(String[] args) {
		String sc = "my code is ( this {and}) ok[k ]";
		
		String sc2 = "({()})";
		
		List<Character> close = Arrays.asList('}', ']', ')');
		List<Character> start = Arrays.asList('{', '[', '(');
		
		char[] chars = sc2.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(Character c: chars) {
			if(close.contains(c)) {
				int i = close.indexOf(c);
				if(start.get(i).equals(stack.peek())) {
					stack.pop();
				};
			} else {
				stack.push(c);
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
