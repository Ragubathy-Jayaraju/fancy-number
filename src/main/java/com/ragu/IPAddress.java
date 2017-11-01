/**
 * 
 */
package com.ragu;

/**
 * @author jayarr4
 *
 */
public class IPAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ipAddress = "10239135";
		
		int startNum = 1;

		int endNum = 235;

		long input;

		long output;

		int loop;

		for (int i = startNum; i <= endNum; i++) {

			input = Long.parseLong(ipAddress + i);
			loop = 0;

			do {

				output = CommonUtil.rec(input);
				if (loop == 0 && output == 41) { // Number 41 is fancy, so filtering only that number.
					/*System.out.println(
							"Loop:" + loop + " => " + inputString + " + " + i + " = " + input + ", Sum: " + output);*/
					System.out.println(i);
				}
				input = output;
				loop++;

			} while (loop < 2);
		}
		
	}

}
