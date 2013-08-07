package counter;

import java.util.Arrays;
import java.util.Collection;

/**
 * Test class used for generic problem, where we test different behavior.
 * 
 * @author AlinaWorkSpace
 * @since 18.7.2013
 * @version 1.0
 * 
 */
public class TestSpecificGenerics {

	public static void main(String[] args) {

		Collection<Integer> collection = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 101, 11, 123, 445, -121);
		
		int countOdd = CountGenerics.countIf(collection, new OddSpecificProperty());
		int countPrime = CountGenerics.countIf(collection, new PrimeNumbersSpecificProperty());
		int countPalindrom = CountGenerics.countIf(collection, new PalindromSpecificProperty());

		System.out.println("Number of odd integers: " + countOdd);
		System.out.println("Number of prime numbers: " + countPrime);
		System.out.println("Number of palindroms: " + countPalindrom);
	}

}
