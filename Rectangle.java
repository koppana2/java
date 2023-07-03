package abstraction;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	private String pattern;

	public Rectangle() {
	}

	public Rectangle(float length, float breadth, String pattern) {
		this();
		this.length = length;
		this.breadth = breadth;
		this.pattern = pattern;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public double getArea() {
		double area = length * breadth;
		return getFormat(area, pattern);
	}

	public double getPerimeter() {
		double perimeter = 2 * length * breadth;
		return getFormat(perimeter, pattern);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", pattern=" + pattern + ", Area()=" + getArea()
				+ ", Perimeter()=" + getPerimeter() + "]";
	}

}
