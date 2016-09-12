package com.hackerrank.code;

class HNode {
	public int frequency; // the frequency of this tree
	public char data;
	public HNode left, right;
}

public class TreeHuffmanDecoding {
	public static void main(String[] args) {
		decode("1001011", new HNode());
	}

	static void decode(String s, HNode root) {
		HNode current = root;
		for(int i = 0; i < s.length(); i++) {
			char p = s.charAt(i);
			current = p == '0'? current.left : current.right;
            if(current.left == null && current.right == null) {
                System.out.print(current.data);
                current = root;
            }
		}
	}
}
