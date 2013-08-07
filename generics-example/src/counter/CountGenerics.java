package counter;

import java.util.Collection;

/**
 * Class used for counting a set of generic elements, which have a specific
 * property.
 * 
 * @author AlinaWorkSpace
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public class CountGenerics {

	/**
	 * Count a collection of generic elements.
	 * 
	 * @param collection
	 *            the elements for counting
	 * @param property
	 *            the property of specific elements
	 * @return the number of elements, with a specific property
	 */
	public static <T> int countIf(Collection<T> collection, SpecificProperty<T> property) {

		int count = 0;
		for (T element : collection)
			if (property.check(element))
				++count;
		return count;
	}

}
