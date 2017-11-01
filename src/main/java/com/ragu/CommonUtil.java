/**
 * 
 */
package com.ragu;

/**
 * @author jayarr4
 *
 */
public class CommonUtil {

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static long rec(long input) {

		long m, n, sum;
		sum = 0;
		m = input;

		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		return sum;
	}

}
