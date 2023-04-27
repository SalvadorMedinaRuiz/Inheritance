package defualt;
public class Circle extends Shape { //this inherits whatever Shape has into Circle

	private double radius;
	
	public Circle() {
		super(); //Explicitly calls the default constructor of the class Shape. If you don't use this, it will always IMPLICITY call the default constructor always.
		radius = 0;
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override //tell ecplise to check if toString exists exactly in super class and if it does, overrides that method with this toString method. You don't need this.
	public String toString()
	{
		return super.toString() + "\nRadius = " + radius; //overrides toString method of the super class and adds onto it and returns it to this class' toString
	
	}

}
