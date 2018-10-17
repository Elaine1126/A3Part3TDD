
public class MyQuadraticEqn {

	public Object findroots(double x) {

		double a, b, c, d, root1, root2;

		a = 1;
		b = 6;
		c = 9;
		d = (b * b) - (4 * a * c);

		// real but different roots
		if (d > 0) {
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
		}

		// real and equal roots
		else if (d == 0) {
			root1 = root2 = -b / (2 * a);
		}

		// imaginary roots
		else {
			double real = -b / (2 * a);
			double imaginary = Math.sqrt(-d) / (2 * a);
		}

		return x;
	}
}
