import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double x, y, resultado;

		byte opcao;
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Menu de opçoes:");

				System.out.println("1 - Somar dois números");
				System.out.println("2 - Subtrair dois números");
				System.out.println("3 - Multiplicar dois números");
				System.out.println("4 - Dividir dois números");
				System.out.println("5 - Raiz quadrada de um número");
				System.out.println("6 - Sair");

				System.out.print("Selecione uma opção: ");

				opcao = scanner.nextByte();
				switch (opcao) {
				case 1:
					System.out.print("Entre com o primeiro número: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo número: ");
					y = scanner.nextDouble();

					resultado = x + y;
					System.out.println("O resultado da soma é: " + resultado);
					break;
				case 2:
					System.out.print("Entre com o primeiro número: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo número: ");
					y = scanner.nextDouble();

					resultado = x - y;
					System.out.println("O resultado da subtração é: " + resultado);
					break;
				case 3:
					System.out.print("Entre com o primeiro número: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo número: ");
					y = scanner.nextDouble();

					resultado = x * y;
					System.out.println("O resultado da multiplicação é: " + resultado);
					break;
				case 4:
					System.out.print("Entre com o primeiro número: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo número: ");
					y = scanner.nextDouble();

					resultado = x / y;
					System.out.println("O resultado da divisão é: " + resultado);
					break;
				case 5:
					System.out.print("Entre com o número: ");
					x = scanner.nextDouble();

					resultado = Math.sqrt(x);
					System.out.println("O resultado da raiz é: " + resultado);
					break;
				case 6:
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}

				System.out.print("Pressione <ENTER> para continuar...");
				if (scanner.hasNextLine())
					scanner.nextLine();
				scanner.nextLine();
				
			} while (opcao != 6);
		}
	}

}
