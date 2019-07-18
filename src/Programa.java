import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Exemplo 1
		long x = 8;

		System.out.println(x);

		x++;
		System.out.println(x);

		// Prática I
		double raio = 3.0;

		double perimetro = Perimetro.calcula(raio);
		System.out.println("O perímetro é " + perimetro);

		double area = Area.calcula(raio);
		System.out.println("A área é " + area);

		// Prática II
		System.out.print("Digite o valor da temperatura em Celcius: ");
		double temperatureInCelcius;
		try (Scanner scanner = new Scanner(System.in)) {
			temperatureInCelcius = scanner.nextDouble();

			double temperatureInFahrenheit = ConvertTemperature.FahrenheitToCelcius(temperatureInCelcius);

			System.out.println("A temperatura " + temperatureInCelcius + "°C é igual a " + temperatureInFahrenheit + "F");
		}
	}

}
