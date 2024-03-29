import java.util.Scanner;

public class DigitoVerificadorSemFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		input.close();
		
        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int soma = (centena * 1) + (dezena * 2) + (unidade * 3);

        int digitoVerificador = soma % 10;

        System.out.println("O dígito verificador é: " + digitoVerificador);
	}

}
