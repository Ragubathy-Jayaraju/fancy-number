package com.ragu;

/**
 * Fancy Number
 *
 */
public class VehicleNumber {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String ka53me = "215345";

		String ka53mf = "215348";

		String inputString = ka53me;

		int startNum = 6267;

		int endNum = 9999;

		long input;

		long output;

		int loop;

		for (int i = startNum; i <= endNum; i++) {

			input = Long.parseLong(inputString + i);
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
