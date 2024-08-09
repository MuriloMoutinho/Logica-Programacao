package sequenciais;
import java.util.Scanner;

public class PrestacaoAtrasada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		double valor = input.nextDouble();
		double taxa = input.nextDouble();
		int dias = input.nextInt();
		input.close();
		
		double aluguel = valor + (valor * (taxa/100)*dias);
		System.out.printf("Valor do aluguel: $%.2f%n", aluguel);
	}

}
