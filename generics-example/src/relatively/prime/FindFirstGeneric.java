package relatively.prime;

import java.util.List;

/**
 * Find the first integer in a list that is relatively prime to a list of
 * specified integers.
 * 
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public final class FindFirstGeneric extends AbstractProperty<Integer> {

	private List<Integer> list;

	/**
	 * Constructor of class.
	 * 
	 * @param list
	 */
	public FindFirstGeneric(List<Integer> list) {
		this.list = list;
	}

	/**
	 * Finds the first integer in a list with a specific property, between an
	 * interval.
	 * 
	 * @param list
	 *            the list to ckeck
	 * @param begin
	 *            the start of the interval
	 * @param end
	 *            the end of the interval
	 * @param property
	 *            the specific property
	 * @return the first integer that is relatively prime to the list
	 */
	public static <T> int findFirst(List<T> list, int begin, int end, AbstractProperty<T> property) {
		for (; begin < end; ++begin) {
			if (property.verify(list.get(begin))) {
				return begin;
			}
		}
		return -1;
	}

	@Override
	public boolean verify(Integer elem) {
		for (Integer i : list)
			if (AbstractProperty.gcd(elem, i) != 1)
				return false;

		return list.size() > 0;
	}

}
