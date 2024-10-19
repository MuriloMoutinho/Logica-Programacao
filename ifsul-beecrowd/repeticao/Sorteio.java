package repeticao;

import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int nInicial = input.nextInt();
		
		int soma = 0;
		int produto = 1;
		for(int i = 0; i < nInicial; i++) {
			int numero = input.nextInt();	
			
			if(numero % 2 == 0) {
				soma += numero;
			}else {
				produto *= numero;
			}
		}
		
		System.out.println(soma);
		System.out.println(produto == 1 ? 0 : produto);
		input.close();
	}

}
