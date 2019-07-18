public class Seno {

	public static void main(String[] args) {
		double x = 0.0;
		System.out.printf("%3s %8s%n", "x", "seno(x)");
		while (x < 2 * Math.PI) {
			double seno = Math.sin(x);
			System.out.printf("%3.1f %8.4f%n", x, seno);
			x += 0.2;
		}
	}

}
