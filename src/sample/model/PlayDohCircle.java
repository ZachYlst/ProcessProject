package sample.model;

public class PlayDohCircle
{
	//Declaration section
	//Data member section
	//NEED TO BE PRIVATE
	private int size;
	
	public PlayDohCircle()
	{
		this.size = 5;
	}

	public PlayDohCircle(int size)
	{
		this.size = size;
	}
	
	public void setSize(int updateSize)
	{
		this.size = updateSize;
	}
	
	public String toString()
	{
		String description = "I am a PlayDoh circle, and my size is " + size;
		return description;
	}
}