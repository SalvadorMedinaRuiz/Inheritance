package defualt;

public class Triangle extends Shape {
	double base;
	double height;
	double area;
	
	public Triangle() {
		super();
		base=2.5;
		height=5.8;
		area=0.0;
	}
	
	public Triangle(String color, boolean filled, double base, double height) {
		super ("Red", true);
	}
	
	public void setBase(double base){
		if (base>0)
			this.base=0;
		else this.base=base;
	}
	
	public void setHeight(double height) {
		if (height>0)
			this.height=0;
		else this.height=height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		area= (1/2) *(this.getBase() * this.getHeight());
		return area;
	}
	
	public boolean equals(Object otherObject)
    {
      if(otherObject == null)
        return false;
      else if(getClass() != otherObject.getClass()) // if this class is not the same as otherObject, returns false
        return false;
      else
      return false;
    }  
	
	@Override
	public String toString() {
		return super.toString() + "\nArea of the Triangle: " + this.getArea();
	}
	
}
