package repeticao;

import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroDentroIntervalo = 0;
		int numeroForaIntervalo = 0;
		
		for(int i = 1; i <=10; i++) {
			int numero = input.nextInt();
			if(numero <= 30 && numero >= 10) {
				numeroDentroIntervalo ++;
			}else {
				numeroForaIntervalo ++;
			}
		}
		
		System.out.println(numeroDentroIntervalo);
		System.out.println(numeroForaIntervalo);
		input.close();
	}

}


