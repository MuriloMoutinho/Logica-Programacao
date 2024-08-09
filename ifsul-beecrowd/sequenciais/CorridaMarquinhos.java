package sequenciais;
import java.util.Scanner;

public class CorridaMarquinhos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double comprimentoPista = input.nextDouble();
		double consumo = input.nextDouble();
		int numeroVoltas = input.nextInt();
		int numeroReabastecimentos = input.nextInt();
		input.close();
		
		
		double kmPista = comprimentoPista/1000;
		double distanciaPista = kmPista*numeroVoltas;
		double consumoTotal = distanciaPista/consumo;
		double combustiveMinimo = consumoTotal / (numeroReabastecimentos + 1);
		System.out.printf("%.1f litros%n", combustiveMinimo);
		
	}

}
