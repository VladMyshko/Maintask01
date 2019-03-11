package by.epam.javatraining.myshko.tasks.maintask01.entity;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import by.epam.javatraining.myshko.tasks.maintask01.model.logic.WorkWithVector;

public class Vector {

	private static final String ROUNDING_VALUE = "##";
	public double[] array;

	public void setArray(int firstInterval, int secondInterval) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (float) WorkWithVector.getRandomNum(firstInterval, secondInterval);
		}

	}

	public double getNumberByIndex(int index) {

		if (index < array.length) {
			return array[index];
		}
		return -1;

	}

	public String toString() {
		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
		DecimalFormat df = new DecimalFormat("#." + ROUNDING_VALUE, otherSymbols);
		df.setRoundingMode(RoundingMode.CEILING);

		StringBuffer vector = new StringBuffer();

		for (double element : array) {
			vector.append(df.format(element) + "\n");
		}

		return vector.toString();
	}

	public void createArray(int firstInterval, int secondInterval) {

		int size = (int) WorkWithVector.getRandomNum(firstInterval, secondInterval);

		while (true) {
			if (size <= 0) {
				size = (int) WorkWithVector.getRandomNum(firstInterval, secondInterval);
			} else {
				break;
			}
		}
		array = new double[size];

	}

}