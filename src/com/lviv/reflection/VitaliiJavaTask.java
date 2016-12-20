package com.lviv.reflection;

public class VitaliiJavaTask {

	// Write the following two functions:
	/**
	 * find the second largest integer in an array.
	 * 
	 * @param ia
	 *            an array of integers
	 * @return the second largest number in ia
	 */

	@MyAnnotation
	private int secondLargest(int[] ia) {
		int max = ia[0];
		int maxSecond = Integer.MIN_VALUE;
		for (int i = 0; i < ia.length; i++) {
			if (max < ia[i]) {
				max = ia[i];
			}
		}
		for (int j = 0; j < ia.length; j++) {

			if (maxSecond < ia[j] && ia[j] != max) {
				maxSecond = ia[j];
			}
		}
		return maxSecond;
	} // secondLargest

	/**
	 * print (System.out.println()) all pairs of numbers chosen from ia, such
	 * that each pair of numbers adds up to target.
	 * 
	 * @param ia
	 *            an array of integers
	 * @param target
	 *            the target integer
	 */
	 @MyAnnotation
	private void findPairs(int[] ia, int target) {
		if (ia.length < 2) {
			System.out.println("array.length must be more then 1 !!!");
			return;
		}

		for (int i = ia.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {

				if (ia[j] > ia[j + 1]) {
					int tmp = ia[j];
					ia[j] = ia[j + 1];
					ia[j + 1] = tmp;
				}
			}
			System.out.print(ia[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ia.length; i++) {
			if (i < ia.length - 1) {
				if (ia[i] == ia[i + 1]) {					
					System.out.println("Pairs = "+ia[i] + " "+ia[i+1]);
					target += (ia[i] + ia[i + 1]);
					i=i+1;
				}
			}

		}
		System.out.println(target);
	}

}
