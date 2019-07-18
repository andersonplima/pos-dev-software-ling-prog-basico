import java.util.Scanner;

public class Distancia {
	public static double distancia(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) {
		// Prática III
		double x1, y1, x2, y2;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entre com a coordenada x do primeiro ponto: ");
			x1 = scanner.nextDouble();
			
			System.out.print("Entre com a coordenada y do primeiro ponto: ");
			y1 = scanner.nextDouble();
			
			System.out.print("Entre com a coordenada x do segundo ponto: ");
			x2 = scanner.nextDouble();
			
			System.out.print("Entre com a coordenada y do segundo ponto: ");
			y2 = scanner.nextDouble();
			
			double distancia = distancia(x1, y1, x2, y2);

			System.out.println("A distância entre os pontos é " + distancia);
		}
	}
}
