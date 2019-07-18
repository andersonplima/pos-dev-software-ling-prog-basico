import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			// Imprimir 5 números inteiros
			System.out.print("Entre com 5 números inteiros: ");
			int[] numerosInteiros = new int[5];

			for (int i = 0; i < numerosInteiros.length; ++i)
				numerosInteiros[i] = scanner.nextInt();

			for (int i = 0; i < numerosInteiros.length; ++i)
				System.out.print(numerosInteiros[i] + " ");

			// Imprimir 10 números reais na ordem inversa
			System.out.print("Entre com 10 números reais: ");
			double[] numerosReais = new double[10];

			for (int i = 0; i < numerosReais.length; ++i)
				numerosReais[i] = scanner.nextDouble();

			for (int i = numerosReais.length - 1; i >= 0; --i)
				System.out.print(numerosReais[i] + " ");

			// Imprimir consoantes
			System.out.print("Entre com uma string de 10 caracteres: ");
			if (scanner.hasNextLine())
				scanner.nextLine();

			String string = scanner.nextLine();
			char[] caracteres = string.toCharArray();

			int quantidadeConsoantes = 0;
			for (int i = 0; i < caracteres.length; ++i)
				if (caracteres[i] != 'a' && caracteres[i] != 'e' && caracteres[i] != 'i' && caracteres[i] != 'o'
						&& caracteres[i] != 'u') {
					quantidadeConsoantes++;
					System.out.print(caracteres[i]);
				}

			System.out.println();
			System.out.println("Foram encontradas " + quantidadeConsoantes + " consoantes.");
		}

	}

}
