package condicionais;

import java.util.Scanner;

public class QuantoFaltaPros50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int IDADE_MINIMA_ENTRADA = 50;
		int anoNascimento = input.nextInt();
		int anoFesta = input.nextInt();
		
		int idade = anoFesta - anoNascimento;
		if(idade >= IDADE_MINIMA_ENTRADA) {
			System.out.println("YES");
		}else {
			int anosRestantes = IDADE_MINIMA_ENTRADA-idade;
			System.out.println("NO");
			System.out.println(anosRestantes);
		}
		input.close();
	}

}
