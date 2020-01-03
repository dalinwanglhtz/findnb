package com.codewardev;

// https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java

public class ASum {

	public static long findNb(long m) {
		long n, total;
		for(n=0, total=0; total < m; n++, total+=n*n*n) {}
		
		return total == m? n : -1;
	}

}
