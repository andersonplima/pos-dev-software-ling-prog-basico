import java.util.Scanner;

public class ReferenciaBibliografica {

	public static void main(String[] args) {
		
		System.out.print("Entre com o nome completo do autor: ");
		try (Scanner scanner = new Scanner(System.in)) {
			
			String nomeCompletoAutor = scanner.nextLine().trim();
			
			int posicaoUltimoEspaco = nomeCompletoAutor.lastIndexOf(' ');
			String ultimoNome = nomeCompletoAutor.substring(posicaoUltimoEspaco + 1);			
			String comecoNome = nomeCompletoAutor.substring(0, posicaoUltimoEspaco);
			
			if (ultimoNome.equals("Júnior") || ultimoNome.equals("Filho") ||
					ultimoNome.equals("Neto") || ultimoNome.equals("Neta") || 
					ultimoNome.equals("Sobrinho") || ultimoNome.equals("Sobrinha")) {
				posicaoUltimoEspaco = comecoNome.lastIndexOf(' ');
				ultimoNome = comecoNome.substring(posicaoUltimoEspaco + 1) + " " + ultimoNome;
				comecoNome = comecoNome.substring(0, posicaoUltimoEspaco);
			}
			
			String referenciaBibliografica = ultimoNome.toUpperCase() + ", " + comecoNome;
			
			System.out.println("A referência bibliográfica é: " + referenciaBibliografica);
		}

	}

}
