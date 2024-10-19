package repeticao;

import java.util.Scanner;

public class ExigenciasEstranhas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int soma = 0;
		int numeroPares = 0;
		int numeroImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			int numero = input.nextInt();
			soma += numero;
			if(numero % 2 == 0) {
				numeroPares ++;
			}else {
				numeroImpares ++;
			}
		}
		System.out.println(soma);
		if(soma % 2 == 0) {
			System.out.println(numeroPares);
		}else {			
			System.out.println(numeroImpares);
		}
		
		input.close();
	}
}

