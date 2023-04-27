package defualt;
public class MakingShapes {

	public static void main(String[] args) {
		
		Shape shape1 = new Shape ("blue", true);
		System.out.println(shape1);
		shape1.setColor("green");
		System.out.println(shape1);
		
		Circle circle1 = new Circle ();
		System.out.println(circle1);
		
		circle1.setColor("purple"); //calls setColor method from Circle (but there is no such method), so it calls it from SHape.java because circle inherited shape.java's stuff
		System.out.println(circle1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		 *
		 * Define a subclass of Shapes called Triangle
		 *  with additional instance variables: base and height
		 * (2pts)Define: constructors (default and parameterized)
		 * (1pt) accessor and mutator methods
		 * (1pt)including: getArea()
		 *  Override: (1pt)toString()
		 *  
		 */
	}

}
