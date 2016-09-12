package com.hackerrank.code;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Prime {

	public void checkPrime(int... nums) {
		for (int num : nums) {
			prime(num);
		}
		System.out.println("");
	}

	private void prime(int num) {
		if (num == 2) {
			System.out.print(2 + " ");
			return;
		} else if (num > 2) {
			int p = IntStream.range(2, num).filter(n -> num % n == 0)
					.findFirst().orElse(0);
			if (p == 0) {
				System.out.print(num + " ");
			}

		}

	}
}

class CheckPrime {

	public static void main(String[] args) {
		try {
			//BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1 = 2;
			int n2 = 1;
			int n3 = 3;
			int n4 = 4;
			int n5 = 5;
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}