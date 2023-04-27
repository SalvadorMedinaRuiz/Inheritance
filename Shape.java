package defualt;
public class Shape {
	private String color;
	private boolean filled;
	
	public Shape()
	{
		color = "white";
		filled = false;
	}

	public Shape (String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	public void setColor (String newColor)
	{
		this.color = newColor;
	}
	
	public void setFilled (boolean filled)
	{
		this.filled = filled;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public boolean isFilled()
	{
		return this.filled;
	}
		
	
	@Override
	public String toString()
	{
		return "Color = " + this.color + "\nFilled = " + this.filled;
	}
	
}
