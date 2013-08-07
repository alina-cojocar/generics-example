package counter;

/**
 * Used to test the behavior of odd integers.
 * 
 * @author AlinaWorkSpace
 * @since 18.07.2013
 * @version 1.0
 * 
 */
public class OddSpecificProperty implements SpecificProperty<Integer> {

	@Override
	public boolean check(Integer element) {
		return (element % 2 != 0);
	}

}
