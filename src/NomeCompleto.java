import java.util.Scanner;

public class NomeCompleto {
	public static void main(String[] args) {

		System.out.print("Entre com o seu nome completo: ");

		try (Scanner scanner = new Scanner(System.in)) {
			String nomeCompleto = scanner.nextLine().toLowerCase();
			String[] nomeCompletoParts = nomeCompleto.split(" ");
			String nomeCompletoAjustado = "";

			for (int i = 0; i < nomeCompletoParts.length; ++i)
				if (!nomeCompletoParts[i].equals("")) {
					if (!nomeCompletoParts[i].equals("de") && !nomeCompletoParts[i].equals("da")
							&& !nomeCompletoParts[i].equals("do") && !nomeCompletoParts[i].equals("dos") 
							&& !nomeCompletoParts[i].equals("das"))
						nomeCompletoAjustado += nomeCompletoParts[i].substring(0, 1).toUpperCase()
								+ nomeCompletoParts[i].substring(1) + " ";
					else
						nomeCompletoAjustado += nomeCompletoParts[i] + " ";
				}
			
			nomeCompletoAjustado = nomeCompletoAjustado.trim();
			System.out.println("O nome completo ajustado é: " + nomeCompletoAjustado);
		}
	}
}
