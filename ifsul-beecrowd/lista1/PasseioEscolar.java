import java.util.Scanner;

public class PasseioEscolar {

	public static void main(String[] args) {
		double DESCONTO = 0.22;
		double QUARTOS = 42;
		double OCUPACAO_MEDIA = 0.40;
		double OCUPACAO_AUMENTO = 0.70;
		double DIAS_MES = 30;
		
		Scanner input = new Scanner(System.in);
		double diaria = input.nextDouble();
		input.close();
		
		double diariaDescontada = diaria - (diaria*DESCONTO);
		double valorSemPromocao = ((QUARTOS*OCUPACAO_MEDIA) * diaria) * DIAS_MES;
		double valorComPromocao = ((QUARTOS*OCUPACAO_AUMENTO) * diariaDescontada) * DIAS_MES;
		double resultado = valorComPromocao - valorSemPromocao;
		
		System.out.printf("R$ %.2f%n", diariaDescontada);
		System.out.printf("R$ %.2f%n", valorSemPromocao);
		System.out.printf("R$ %.2f%n", valorComPromocao);
		System.out.printf("R$ %.2f%n", resultado);
		

	}

}
