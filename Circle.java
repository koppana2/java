package interfaces;

public class Circle implements shape{
	
	private float radius;
	private String pattern;

	public Circle() {
	}

	public Circle(float radius, String pattern) {
		this();
		this.radius = radius;
		this.pattern = pattern;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public double getArea() {
		double area = pi * radius * radius;
		return shape.getFormat(area, pattern);
	}

	public double getPerimeter() {
		double perimeter = 2 * pi * radius;
		return shape.getFormat(perimeter, pattern);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pattern=" + pattern + ", Area=" + getArea() + ", Perimeter="
				+ getPerimeter() + "]";
	}

	

}

