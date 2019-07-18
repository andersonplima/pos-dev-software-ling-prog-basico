import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		double numero1, numero2, numero3;

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Entre com o primeiro número: ");
			numero1 = entrada.nextDouble();

			System.out.print("Entre com o segundo número: ");
			numero2 = entrada.nextDouble();

			System.out.print("Entre com o terceiro número: ");
			numero3 = entrada.nextDouble();

			if (numero1 <= numero2) {
				if (numero2 <= numero3)
					System.out.println("Os número em ordem são: " + numero1 + ", " + numero2 + ", " + numero3);
				else if (numero3 >= numero1)
					System.out.println("Os número em ordem são: " + numero1 + ", " + numero3 + ", " + numero2);
				else
					System.out.println("Os número em ordem são: " + numero3 + ", " + numero1 + ", " + numero2);
			} else if (numero2 <= numero3) {
				if (numero1 <= numero3)
					System.out.println("Os número em ordem são: " + numero2 + ", " + numero1 + ", " + numero3);
				else
					System.out.println("Os número em ordem são: " + numero2 + ", " + numero3 + ", " + numero1);
			} else
				System.out.println("Os número em ordem são: " + numero3 + ", " + numero2 + ", " + numero1);
		}

	}

}
