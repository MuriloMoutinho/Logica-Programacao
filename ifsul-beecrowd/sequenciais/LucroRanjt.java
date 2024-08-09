package sequenciais;
import java.util.Scanner;

public class LucroRanjt {

	public static void main(String[] args) {
		double VALOR_GASOLINA = 2.50;
		
		Scanner input = new Scanner(System.in);
		double kmInicio = input.nextDouble();
		double kmFinal = input.nextDouble();
		double litrosGasolinaGasta = input.nextDouble();
		double valorRecebido = input.nextDouble();
		input.close();
		
		double kmRealizados = kmFinal - kmInicio;
		double mediaConsumoGasolina = kmRealizados/litrosGasolinaGasta;
		double valorGasolinaGasta = litrosGasolinaGasta*VALOR_GASOLINA;				
		double lucro = valorRecebido-valorGasolinaGasta;
		
		System.out.printf("Media de consumo: %.2f Km/l%n",mediaConsumoGasolina);
		System.out.printf("Lucro: $%.2f%n", lucro);
	}

}

