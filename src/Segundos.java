import java.util.Scanner;

public class Segundos {
	public static String split(int segundos) {
		int horasPart = segundos / 3600;
		int resto = segundos % 3600;

		int minutosPart = resto / 60;
		int segundosPart = resto % 60;

		return segundos + "s = " + horasPart + "h + " + minutosPart + "m + " + segundosPart + "s";
	}

	public static void main(String[] args) {
		// Prática IV
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entre com um tempo em segundos:");
			int segundos = scanner.nextInt();

			String horasMinutosSegundos = Segundos.split(segundos);
			System.out.println(horasMinutosSegundos);
		}
	}
}
