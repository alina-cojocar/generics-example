package counter;

/**
 * Used to test the behavior of prime numbers.
 * 
 * @author AlinaWorkSpace
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public class PrimeNumbersSpecificProperty implements SpecificProperty<Integer> {

	@Override
	public boolean check(Integer element) {
		if (element < 2) {
			return false;
		}
		for (int i = 2; i <= (element / 2); i++) {
			if (element % i == 0) {
				return false;
			}
		}
		return true;
	}

}
