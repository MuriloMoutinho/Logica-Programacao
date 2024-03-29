import java.util.Scanner;

public class JogosOlimpicos {

	public static void main(String[] args) {
		double VALOR_DESCONTO = 0.25;
		double OCUPACAO_INCOMPLETA = 0.7;
		
		Scanner input = new Scanner(System.in);
		int apartamentos = input.nextInt();
		double valorDiaria = input.nextDouble();
		input.close();
		
		double diariaDescontada = valorDiaria - (valorDiaria * VALOR_DESCONTO);
		
		double valorTotalArrecadado = diariaDescontada * apartamentos;
		double valorIncompletoArrecadado = valorTotalArrecadado *  OCUPACAO_INCOMPLETA;
		
		double valorPerdido = (valorDiaria * apartamentos) - valorTotalArrecadado;
		
		System.out.printf("R$ %.2f%n", diariaDescontada);
		System.out.printf("R$ %.2f%n", valorTotalArrecadado);
		System.out.printf("R$ %.2f%n", valorIncompletoArrecadado);
		System.out.printf("R$ %.2f%n", valorPerdido);
		
	}

}

