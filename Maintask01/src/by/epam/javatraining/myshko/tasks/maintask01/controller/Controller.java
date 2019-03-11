package by.epam.javatraining.myshko.tasks.maintask01.controller;

import by.epam.javatraining.myshko.tasks.maintask01.view.ConsoleOut;

import by.epam.javatraining.myshko.tasks.maintask01.entity.Vector;
import by.epam.javatraining.myshko.tasks.maintask01.model.logic.WorkWithVector;

public class Controller {

	public static void main(String[] args) {

		int firstIntervalForRandomNum = -10;
		int secondIntervalForRandomNum = 10;
		double key = 3;
		int index = 2;

		Vector vector = new Vector();

		vector.createArray(firstIntervalForRandomNum, secondIntervalForRandomNum);
		vector.setArray(firstIntervalForRandomNum, secondIntervalForRandomNum);

		ConsoleOut.outputArray(vector.toString());
		ConsoleOut.outputGetNumberByIndex(vector.getNumberByIndex(index));
		ConsoleOut.outputMinElement(WorkWithVector.getMinElement(vector.array));
		ConsoleOut.outputMaxElement(WorkWithVector.getMaxElement(vector.array));
		ConsoleOut.outputArithmeticAverage(WorkWithVector.arithmeticAverage(vector.array));
		ConsoleOut.outputGeometricAverage(WorkWithVector.geometricAverage(vector.array));
		ConsoleOut.outputGetLocalMinPosistion(WorkWithVector.getLocalMinPosistion(vector.array));
		ConsoleOut.outputIsSorting(WorkWithVector.isSorting(vector.array));
		ConsoleOut.outputLinearSearch(WorkWithVector.linearSearch(key, vector.array));
		ConsoleOut.outputBinarySearch(WorkWithVector.binarySearch(key, vector.array));
		WorkWithVector.reverseArray(vector.array);
		ConsoleOut.outputReverseArray(vector.toString());
		WorkWithVector.bubbleSorter(vector.array);
		ConsoleOut.outputSortingArray(vector.toString());
		
				//Other types of sorting\\
		
		// WorkWithVector.insertionSorter(vector.array);
		// ConsoleOut.outputSortingArray(vector.toString());
		// WorkWithVector.selectionSorter(vector.array);
		// ConsoleOut.outputSortingArray(vector.toString());
	}

}
