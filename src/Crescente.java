import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		double numero1, numero2, numero3;

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Entre com o primeiro n�mero: ");
			numero1 = entrada.nextDouble();

			System.out.print("Entre com o segundo n�mero: ");
			numero2 = entrada.nextDouble();

			System.out.print("Entre com o terceiro n�mero: ");
			numero3 = entrada.nextDouble();

			if (numero1 <= numero2) {
				if (numero2 <= numero3)
					System.out.println("Os n�mero em ordem s�o: " + numero1 + ", " + numero2 + ", " + numero3);
				else if (numero3 >= numero1)
					System.out.println("Os n�mero em ordem s�o: " + numero1 + ", " + numero3 + ", " + numero2);
				else
					System.out.println("Os n�mero em ordem s�o: " + numero3 + ", " + numero1 + ", " + numero2);
			} else if (numero2 <= numero3) {
				if (numero1 <= numero3)
					System.out.println("Os n�mero em ordem s�o: " + numero2 + ", " + numero1 + ", " + numero3);
				else
					System.out.println("Os n�mero em ordem s�o: " + numero2 + ", " + numero3 + ", " + numero1);
			} else
				System.out.println("Os n�mero em ordem s�o: " + numero3 + ", " + numero2 + ", " + numero1);
		}

	}

}
