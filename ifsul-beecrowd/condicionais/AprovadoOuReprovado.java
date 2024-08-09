package condicionais;

import java.util.Scanner;

public class AprovadoOuReprovado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double somaNotas = 0;

		for(int i = 0; i < 5; i++) {
			double nota = input.nextDouble();
			somaNotas += nota;
		}
		
		double media = somaNotas/5;
		if(media >= 6) {
			System.out.println("APPROVED");
		}else {
			System.out.println("RETAKE");
		}
		System.out.printf("%.2f%n", media);
		input.close();
	}

}
