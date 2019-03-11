package by.epam.javatraining.myshko.tasks.maintask01.view;

public class ConsoleOut {

	public static final String GET_NUMBER_BY_INDEX_TEXT = "Your number is: ";
	public static final String SHOW_ARRAY_TEXT = "Your array: ";
	public static final String GET_MIN_ELEMENT_TEXT = "The minimum element is: ";
	public static final String GET_MAX_ELEMENT_TEXT = "The maximum element is: ";
	public static final String ARITHMETIC_AVERAGE_TEXT = "Arithmetic average is: ";
	public static final String GEOMETRIC_AVERAGE_TEXT = "Geometric average is: ";
	public static final String LOCAL_MIN_POSITION_TEXT = "The first local min position is: ";
	public static final String IS_SORTING_TEXT = "Is the array sorted? - ";
	public static final String LINEAR_SEARCH_TEXT = "Using linear search your element is in position ";
	public static final String BINARY_SEARCH_TEXT = "Using binary search your element is in position ";
	public static final String REVERSE_ARRAY_TEXT = "Your array after reversing: ";
	public static final String ARRAY_SORTING_TEXT = "Your array after sorting: ";

	public static void outputArray(String array) {

		System.out.println(SHOW_ARRAY_TEXT + "\n" + array);

	}

	public static void outputGetNumberByIndex(double number) {

		System.out.println(GET_NUMBER_BY_INDEX_TEXT + number);
	}

	public static void outputMinElement(double minElement) {
		System.out.println(GET_MIN_ELEMENT_TEXT + minElement);
	}

	public static void outputMaxElement(double maxElement) {
		System.out.println(GET_MAX_ELEMENT_TEXT + maxElement);
	}

	public static void outputArithmeticAverage(double arithmeticAverage) {
		System.out.println(ARITHMETIC_AVERAGE_TEXT + arithmeticAverage);
	}

	public static void outputGeometricAverage(double geometricAverage) {
		System.out.println(GEOMETRIC_AVERAGE_TEXT + geometricAverage);

	}

	public static void outputGetLocalMinPosistion(int localMinPosistion) {
		System.out.println(LOCAL_MIN_POSITION_TEXT + localMinPosistion);

	}

	public static void outputIsSorting(boolean sorting) {
		System.out.println(IS_SORTING_TEXT + sorting);

	}

	public static void outputLinearSearch(int linearSearch) {
		System.out.println(LINEAR_SEARCH_TEXT + linearSearch);

	}

	public static void outputBinarySearch(int binarySearch) {
		System.out.println(BINARY_SEARCH_TEXT + binarySearch);

	}

	public static void outputReverseArray(String reverseArray) {
		System.out.println(REVERSE_ARRAY_TEXT + "\n" + reverseArray);

	}

	public static void outputSortingArray(String array) {
		System.out.println(ARRAY_SORTING_TEXT + "\n" + array);

	}

}
