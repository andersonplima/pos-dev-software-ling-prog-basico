import java.util.Scanner;

public class Aula3PraticaV {

	public static void main(String[] args) {
		String[] perguntas = { "Telefonou para a vítima (S/N)?", "Esteve no local do crime (S/N)?",
				"Mora perto da vítima (S/N)?", "Devia para a vítima (S/N)?", "Já trabalhou com a vítima (S/N)?" };

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
				resposta = "Não";

			System.out.printf("%s: %s%n", perguntas[i], resposta);
		}

		switch (positivas) {
		case 0:
		case 1:
			System.out.println("Você é inocente.");
			break;
		case 2:
			System.out.println("Você é suspeito.");
			break;
		case 3:
		case 4:
			System.out.println("Você é cúmplice.");
			break;
		default:
			System.out.println("Você é culpado!");
		}

	}

}
