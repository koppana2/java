package interfaces;

import java.text.DecimalFormat;

public interface shape {

	public float pi = 3.14f;

	public double getArea();

	public double getPerimeter();

	public static double getFormat(double value, String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		return Double.parseDouble(df.format(value));
	}
}
