
public class Fatorial {

	public static void main(String[] args) {
		int x;
		long fatorial;

		// fatorial de 2
		x = 2;
		fatorial = 1;
		for (int i = x; i > 1; --i)
			fatorial *= i;

		System.out.println("O fatorial de " + x + " é: " + fatorial);

		// fatorial de 4
		x = 4;
		fatorial = 1;
		for (int i = x; i > 1; --i)
			fatorial *= i;

		System.out.println("O fatorial de " + x + " é: " + fatorial);

		// fatorial de 6
		x = 6;
		fatorial = 1;
		for (int i = x; i > 1; --i)
			fatorial *= i;

		System.out.println("O fatorial de " + x + " é: " + fatorial);

		// fatorial de 10
		x = 10;
		fatorial = 1;
		for (int i = x; i > 1; --i)
			fatorial *= i;

		System.out.println("O fatorial de " + x + " é: " + fatorial);
	}

}
