package counter;

/**
 * Used to test the behavior of symmetric numbers.
 * 
 * @author AlinaWorkSpace
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public class PalindromSpecificProperty implements SpecificProperty<Integer> {

	@Override
	public boolean check(Integer element) {
		int palindrome = element;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		if (element == reverse) {
			return true;
		}
		return false;
	}

}
