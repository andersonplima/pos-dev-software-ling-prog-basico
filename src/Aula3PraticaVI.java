import java.util.Scanner;

public class Aula3PraticaVI {

	public static void main(String[] args) {

		float[] notas = new float[100];
		int length = 0;

		System.out.println("Entre com uma lista de notas:");
		try (Scanner scanner = new Scanner(System.in)) {
			float nota;
			do {
				nota = scanner.nextFloat();
				if (nota != -1)
					notas[length++] = nota;
			} while (nota != -1);
		}

		System.out.println("Foram lidos " + length + " valores");

		System.out.println("Os valores na ordem direta são: ");
		for (int i = 0; i < length; ++i)
			System.out.print(notas[i] + " ");		

		System.out.println("Os valores na ordem inversa são: ");
		for (int i = length - 1; i > -1; --i)
			System.out.println(notas[i]);		

		System.out.print("A soma dos valores é: ");
		
		float soma = 0;
		for (int i = 0; i < length; ++i)
			soma += notas[i];
		
		System.out.println(soma);
		
		float media = soma / length;
		System.out.println("A média dos valores é: " + media);
		
		System.out.print("A quantidade de valores acima da média é: ");
		
		float quantidade = 0;
		for (int i = 0; i < length; ++i)
			if (notas[i] > media)
				++quantidade;
		
		System.out.println(quantidade);
		
		System.out.print("A quantidade de valores abaixo de sete é: ");
		
		quantidade = 0;
		for (int i = 0; i < length; ++i)
			if (notas[i] < 7)
				++quantidade;
		
		System.out.println(quantidade);
		
		System.out.println("Bye!");
	}

}
