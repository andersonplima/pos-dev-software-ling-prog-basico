import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entre com uma frase: ");
			String frase = scanner.nextLine();
			
			System.out.print("Entre com uma palavra para pesquisar: ");
			String pesquisa = scanner.nextLine();
			
			System.out.print("Entre com a palavra para substituir: ");
			String substituta = scanner.nextLine();
			
			String fraseModificada = frase.replace(pesquisa, substituta);
			System.out.println("A frase modificada é: " + fraseModificada);
		}				

	}

}
