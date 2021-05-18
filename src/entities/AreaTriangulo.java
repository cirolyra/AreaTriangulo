package entities;

public class AreaTriangulo {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2;
		// double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
