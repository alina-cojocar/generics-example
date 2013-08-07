package relatively.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class of test for <code>FindFirstGeneric</code> behavior.
 * 
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public class TestClass {

	public static void main(String[] args) {

		List<Integer> aList = new ArrayList<Integer>(Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32));
		List<Integer> bList = new ArrayList<Integer>(Arrays.asList(7, 18, 19, 25));
		FindFirstGeneric ffg = new FindFirstGeneric(bList);

		int i = FindFirstGeneric.findFirst(aList, 0, aList.size(), ffg);

		if (i != -1) {
			System.out.print(aList.get(i) + " is relative prime to ");
			for (Integer j : bList) {
				System.out.print(j + " ");
			}
		}

	}

}
