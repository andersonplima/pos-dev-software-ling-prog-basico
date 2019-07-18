
public class SomaSerie {

	public static void main(String[] args) {
		double soma = 0.0;
		
		for (int i = 1; i <= 50; ++i)
			soma += (2.0*i - 1.0)/i;		
		
		System.out.println("A soma da série é: " + soma);
	}

}
