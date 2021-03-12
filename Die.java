// chapter 4 game zone (page227)

public class Die
{
	// data field variables for this class
	private int dieValue;
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;

	// constuctor method for this class
	public Die()
	{
		dieValue = (int)(Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	// accesor (getter) method for dieValue 

	public int getDieValue()
	{
		return dieValue;
	}
}