package relatively.prime;

/**
 * Abstract class used to describe functionality abstract or implemented of
 * classes that need these behavior.
 * 
 * @since 18.07.2013
 * @version 1.0
 * 
 * @param <T>
 */
public abstract class AbstractProperty<T> {

	/**
	 * Check certain functionality of a generic element.
	 * 
	 * @param elem
	 *            the generic element to ckeck
	 * @return true if the functionality of the element fits; false otherwise
	 */
	public abstract boolean verify(T elem);

	/**
	 * Greatest common divisor between two elements.
	 * 
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return greatest common divisor between two numbers
	 */
	public static int gcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
