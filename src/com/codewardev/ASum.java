package com.codewardev;

// https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java

public class ASum {

	public static long findNb(long m) {
		long n=0;
		long total=0;
		while(total < m) {
			n++;
			total += n*n*n;
			//System.out.println("Result: "+total+"/"+m);
		}
		System.out.println("Total: "+total+" n= "+n+" m="+m);
		
		return total == m? n : -1;
	}

}
