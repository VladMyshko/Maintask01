package by.epam.javatraining.myshko.tasks.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class WorkWithVectorTest {

	@Test
	public void testGetRandomNumUnderZero() {
		int firstInterval = -1;
		int secondInterval = -2;
		double expected = -1;
		double delta = 0.5;
		Assert.assertEquals(expected, WorkWithVector.getRandomNum(firstInterval, secondInterval), delta);
	}

	@Test
	public void testGetRandomNum() {
		int firstInterval = 1;
		int secondInterval = 2;
		double expected = 1.5;
		double delta = 0.5;
		Assert.assertEquals(expected, WorkWithVector.getRandomNum(firstInterval, secondInterval), delta);
	}

	@Test
	public void testGetMinElement() {
		double[] array = { 2.2, 3.3, 1, 9.2 };
		double expected = 1;
		double delta = 0.5;
		Assert.assertEquals(expected, WorkWithVector.getMinElement(array), delta);
	}

	@Test
	public void testGetMaxElement() {
		double[] array = { 2.2, 3.3, 1, 9.2 };
		double expected = 9.2;
		double delta = 0.5;
		Assert.assertEquals(expected, WorkWithVector.getMaxElement(array), delta);
	}

	@Test
	public void testArithmeticAverage() {
		double[] array = { 1, 2, 3 };
		double expected = 2;
		double delta = 0.5;
		Assert.assertEquals(expected, WorkWithVector.arithmeticAverage(array), delta);
	}
	
	@Test
	public void testGeometricAverage() {
		double[] array = {2,4,8};
		double expected = 4;
		double delta = 0.5;
		Assert.assertEquals(expected,WorkWithVector.geometricAverage(array),delta);
	}
	
	@Test
	public void testIsSortingFalse() {
		double[] array = { 2.2, 3.3, 1, 9.2};
		boolean expected = false;
		Assert.assertEquals(expected, WorkWithVector.isSorting(array));
	}
	
	@Test
	public void testIsSortingTrue() {
		double[] array = {1, 2.2, 3.3, 9.2};
		boolean expected = true;
		Assert.assertEquals(expected, WorkWithVector.isSorting(array));
	}
	
	@Test
	public void testGetLocalMinPosistion() {
		double[] array = {2,1.1, 4, 9.9};
		int expected = 1;
		Assert.assertEquals(expected, WorkWithVector.getLocalMinPosistion(array));
	}
	
	@Test
	public void testReverseArray() {
		double[] array = {2.2, 1.9, 5.7, 4.2};
		double[] expected = {4.2, 5.7, 1.9, 2.2};
		double delta = 0.5;
		Assert.assertArrayEquals(expected, WorkWithVector.reverseArray(array), delta);
	}
	
	@Test
	public void testBubbleSorter() {
		double[] array = {2.4, 1.2, 3.6, 0.2, 1.1};
		double[] expected = {0.2, 1.1, 1.2, 2.4,3.6};
		double delta = 0.5;
		Assert.assertArrayEquals(expected, WorkWithVector.bubbleSorter(array), delta);
	}
	
	@Test
	public void testLinearSearch() {
		double[] array = {1.23, 2.34, 3.5, 4.124, 9,78};
		double key = 3.5;
		int expected = 2;
		Assert.assertEquals(expected, WorkWithVector.linearSearch(key, array));
	}
	
	@Test
	public void testBinarySearchMidElement() {
		double[] array = {1.23, 2.34, 3.5, 4.124, 9,78};
		double key = 3.5;
		int expected = 2;
		Assert.assertEquals(expected, WorkWithVector.linearSearch(key, array));
	}
	
	@Test
	public void testBinarySearchLeftBranch() {
		double[] array = {1.23, 2.34, 3.5, 4.124, 9.78};
		double key = 2.34;
		int expected = 1;
		Assert.assertEquals(expected, WorkWithVector.linearSearch(key, array));
	}
	
	@Test
	public void testBinarySearchRightBranch() {
		double[] array = {1.23, 2.34, 3.5, 4.124, 9.78};
		double key = 9.78;
		int expected = 4;
		Assert.assertEquals(expected, WorkWithVector.linearSearch(key, array));
	}

}
