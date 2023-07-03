package interfaces;

public class Triangle implements shape {

	private float side1, side2, side3;
	String pattern;

	public Triangle() {
	}

	public Triangle(float side1, float side2, float side3, String pattern) {
		this();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.pattern = pattern;
	}

	public float getSide1() {
		return side1;
	}

	public void setSide1(float side1) {
		this.side1 = side1;
	}

	public float getSide2() {
		return side2;
	}

	public void setSide2(float side2) {
		this.side2 = side2;
	}

	public float getSide3() {
		return side3;
	}

	public void setSide3(float side3) {
		this.side3 = side3;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public double getArea() {
		double side = getPerimeter() / 2;
		double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));
		return shape.getFormat(area, pattern);
	}

	@Override
	public double getPerimeter() {
		double perimeter = (side1 + side2 + side3);
		return shape.getFormat(perimeter, pattern);
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", pattern=" + pattern
				+ ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}

}
