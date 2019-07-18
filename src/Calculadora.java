import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double x, y, resultado;

		byte opcao;
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Menu de op�oes:");

				System.out.println("1 - Somar dois n�meros");
				System.out.println("2 - Subtrair dois n�meros");
				System.out.println("3 - Multiplicar dois n�meros");
				System.out.println("4 - Dividir dois n�meros");
				System.out.println("5 - Raiz quadrada de um n�mero");
				System.out.println("6 - Sair");

				System.out.print("Selecione uma op��o: ");

				opcao = scanner.nextByte();
				switch (opcao) {
				case 1:
					System.out.print("Entre com o primeiro n�mero: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo n�mero: ");
					y = scanner.nextDouble();

					resultado = x + y;
					System.out.println("O resultado da soma �: " + resultado);
					break;
				case 2:
					System.out.print("Entre com o primeiro n�mero: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo n�mero: ");
					y = scanner.nextDouble();

					resultado = x - y;
					System.out.println("O resultado da subtra��o �: " + resultado);
					break;
				case 3:
					System.out.print("Entre com o primeiro n�mero: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo n�mero: ");
					y = scanner.nextDouble();

					resultado = x * y;
					System.out.println("O resultado da multiplica��o �: " + resultado);
					break;
				case 4:
					System.out.print("Entre com o primeiro n�mero: ");
					x = scanner.nextDouble();

					System.out.print("Entre com o segundo n�mero: ");
					y = scanner.nextDouble();

					resultado = x / y;
					System.out.println("O resultado da divis�o �: " + resultado);
					break;
				case 5:
					System.out.print("Entre com o n�mero: ");
					x = scanner.nextDouble();

					resultado = Math.sqrt(x);
					System.out.println("O resultado da raiz �: " + resultado);
					break;
				case 6:
					break;
				default:
					System.out.println("Op��o inv�lida!");
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
