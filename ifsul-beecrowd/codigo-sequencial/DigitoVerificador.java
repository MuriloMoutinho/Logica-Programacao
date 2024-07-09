import java.util.Scanner;

public class DigitoVerificador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		input.close();
		
		String numeroTextoInvertido = new StringBuilder(Integer.toString(numero)).reverse().toString();
		int numeroInvertido = Integer.parseInt(numeroTextoInvertido);
		String somaNumeros = Integer.toString(numero + numeroInvertido);
		String[] numeroRepartido = somaNumeros.split("");

		int valorFinal = 0;
		for (int i = 0; i < numeroRepartido.length; i++) {
			valorFinal += Integer.parseInt(numeroRepartido[i])*(i+1);
		}

		System.out.println(valorFinal%10);
		
	

	}

}
