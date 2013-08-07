package counter;

/**
 * Interface used to implement different behavior for different objects.
 * 
 * @author AlinaWorkSpace
 * @since 18.07.2013
 * @version 1.0
 * @param <T>
 *            generic type
 */
public interface SpecificProperty<T> {

	/**
	 * Method used to test different behavior, e.g. prime number, odd integer or
	 * palindrom number.
	 * 
	 * @param element
	 *            the generic element to test
	 * @return true if the object corresponds, false otherwise
	 */
	public boolean check(T element);

}
