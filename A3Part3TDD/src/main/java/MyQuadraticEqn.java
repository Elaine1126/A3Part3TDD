
public class MyQuadraticEqn {

	public Object findroot1(double x1) {

		double a, b, c, d, root1;

		a = 1;
		b = 6;
		c = 9;
		d = (b * b) - (4 * a * c);

		// real but different roots
		if (d > 0) {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
		}

		// real and equal roots
		else if (d == 0) {
			root1 = -b / (2 * a);
		}

		// imaginary roots
		else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-d) / (2 * a);
		}

		return x1;
	}

	public Object findroot2(double x2) {
		double a, b, c, d, root2;

		a = 1;
		b = 6;
		c = 9;
		d = (b * b) - (4 * a * c);

		// real but different roots
		if (d > 0) {
			root2 = (-b - Math.sqrt(d)) / (2 * a);
		}

		// real and equal roots
		else if (d == 0) {
			root2 = -b / (2 * a);
		}

		// imaginary roots
		else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-d) / (2 * a);
		}
		return x2;
	}
}
