import java.util.Scanner;

public class Aula3PraticaV {

	public static void main(String[] args) {
		String[] perguntas = { "Telefonou para a v�tima (S/N)?", "Esteve no local do crime (S/N)?",
				"Mora perto da v�tima (S/N)?", "Devia para a v�tima (S/N)?", "J� trabalhou com a v�tima (S/N)?" };

		boolean[] respostas = new boolean[5];

		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < 5; ++i) {
				System.out.print(perguntas[i]);
				respostas[i] = scanner.nextLine().equalsIgnoreCase("S");
			}
		}

		System.out.println("Suas respostas foram:");
		int positivas = 0;
		String resposta;

		for (int i = 0; i < 5; ++i) {
			if (respostas[i]) {
				++positivas;
				resposta = "Sim";
			} else
				resposta = "N�o";

			System.out.printf("%s: %s%n", perguntas[i], resposta);
		}

		switch (positivas) {
		case 0:
		case 1:
			System.out.println("Voc� � inocente.");
			break;
		case 2:
			System.out.println("Voc� � suspeito.");
			break;
		case 3:
		case 4:
			System.out.println("Voc� � c�mplice.");
			break;
		default:
			System.out.println("Voc� � culpado!");
		}

	}

}
