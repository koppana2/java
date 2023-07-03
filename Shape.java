package abstraction;

import java.text.DecimalFormat;

public abstract class Shape {
	public abstract double getArea();

	public abstract double getPerimeter();

	public double getFormat(double value, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		return Double.parseDouble(df.format(value));
	}
}