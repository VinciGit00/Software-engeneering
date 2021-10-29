
public class Operazioni {

	public static double Sub(double a, double b) {

		return a - b;
	}

	public static double Sum(double a, double b) {

		return a + b;

	}

	public static double Div(double a, double b) {

		try {
			return a / b;
		} catch (ArithmeticException e) {
			return 0;
		}

	}

	public static double Mul(double a, double b) {

		return a * b;

	}
}
