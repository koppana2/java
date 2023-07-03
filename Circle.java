package abstraction;

public class Circle extends Shape {
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
		double area = 3.14 * radius * radius;
		return getFormat(area, pattern);
	}

	public double getPerimeter() {
		double perimeter = 2 * 3.14 * radius;
		return getFormat(perimeter, pattern);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area()=" + getArea() + ", Perimeter()=" + getPerimeter() + "]";
	}

}
