package by.epam.javatraining.myshko.tasks.maintask01.model.logic;

import java.util.Random;

public final class WorkWithVector {

	public static double getRandomNum(int firstInterval, int secondInterval) {

		if (firstInterval < 0 && secondInterval <= 0) {
			return -1;
		}

		Random random = new Random();

		while (true) {
			double num = random.nextDouble() * (secondInterval - firstInterval) + firstInterval;

			if (num > 0) {
				return num;
			}
		}

	}

	public static double getMinElement(double[] array) {
		double minElem = array[0];

		for (int i = 0; i < array.length; i++) {
			if (minElem > array[i]) {
				minElem = array[i];
			}
		}

		return minElem;
	}

	public static double getMaxElement(double array[]) {

		double maxElem = array[0];

		for (int i = 0; i < array.length; i++) {
			if (maxElem < array[i]) {
				maxElem = array[i];
			}
		}

		return maxElem;
	}

	public static double arithmeticAverage(double array[]) {
		double arithmeticAverage = 0;

		for (int i = 0; i < array.length; i++) {
			arithmeticAverage += array[i];
		}

		return arithmeticAverage / array.length;
	}

	public static double geometricAverage(double array[]) {
		double geometricAverage = 1;

		for (int i = 0; i < array.length; i++) {
			geometricAverage *= array[i];
		}

		return Math.pow(geometricAverage, (double) 1 / array.length);
	}

	public static boolean isSorting(double array[]) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				return false;
			}

		}
		return true;

	}

	public static int getLocalMinPosistion(double array[]) {

		int i = 0;

		for (; i < array.length; i++) {
			if (array[i] < (i > 0 ? array[i - 1] : Integer.MAX_VALUE)
					&& array[i] < (i < array.length - 1 ? array[i + 1] : Integer.MAX_VALUE)) {
				break;
			}
		}
		return i;

	}

	public static double[] reverseArray(double array[]) {
		for (int i = 0; i < array.length / 2; i++) {
			double j = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = j;

		}
		return array;
	}

	public static int linearSearch(double key, double array[]) {

		bubbleSorter(array);

		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}

		return -1;

	}

	public static int binarySearch(double key, double[] array) {

		int high = array.length - 1;
		int low = 0;

		bubbleSorter(array);

		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}

	public static double[] bubbleSorter(double array[]) {

		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void insertionSorter(double array[]) {

		for (int i = 1; i < array.length; ++i) {
			double key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void selectionSorter(double array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[min_idx])
					min_idx = j;
			double temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}

	}

	static void merge(double array[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		double L[] = new double[n1];
		double R[] = new double[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = array[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = array[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void mergeSorter(double array[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSorter(array, l, m);
			mergeSorter(array, m + 1, r);

			// Merge the sorted halves
			merge(array, l, m, r);
		}
	}

}
