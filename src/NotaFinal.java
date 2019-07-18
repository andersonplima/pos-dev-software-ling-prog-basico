import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		double notaTrabalhoLaboratorio;
		double notaAvaliacaoSemestral;
		double notaExameFinal;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entre com a nota do trabalho de laborat�rio: ");
			notaTrabalhoLaboratorio = scanner.nextDouble();
			if (notaTrabalhoLaboratorio < 0 || notaTrabalhoLaboratorio > 10)
				System.out.println("Nota inv�lida!");
			else {
				System.out.print("Entre com a nota da avalia��o semestral: ");
				notaAvaliacaoSemestral = scanner.nextDouble();
				if (notaAvaliacaoSemestral < 0 || notaAvaliacaoSemestral > 10)
					System.out.println("Nota inv�lida!");
				else {
					System.out.print("Entre com a nota do exame final: ");
					notaExameFinal = scanner.nextDouble();
					if (notaExameFinal < 0 || notaExameFinal > 10) 
						System.out.println("Nota inv�lida!");
					else {
						double mediaPonderada = (notaTrabalhoLaboratorio * 2.0 + notaAvaliacaoSemestral * 3.0
								+ notaExameFinal * 5.0) / 10.0;

						char conceito;
						if (mediaPonderada >= 8)
							conceito = 'A';
						else if (mediaPonderada >= 7)
							conceito = 'B';
						else if (mediaPonderada >= 6)
							conceito = 'C';
						else if (mediaPonderada >= 5)
							conceito = 'D';
						else
							conceito = 'E';

						System.out.println("A m�dia ponderada do aluno �: " + mediaPonderada);
						System.out.println("O conceito do aluno �: " + conceito);
					}
				}
			}			
		}

	}

}
