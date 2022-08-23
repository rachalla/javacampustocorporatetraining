
public class Circle {

	private int radius;
	
	public Circle() {
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}
