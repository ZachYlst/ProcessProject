package sample.model;

public class PlayDohSquare
{
	private int length;

	public PlayDohSquare()
	{
		this.length = 15;
	}

	public PlayDohSquare(int length)
	{
		this.length = length;
	}

	public String toString()
	{
		String description = "I am a PlayDoh square, and my size is " + length;
		return description;

	}
}