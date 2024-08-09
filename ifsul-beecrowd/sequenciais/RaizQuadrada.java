package sequenciais;
import java.util.Scanner;

public class RaizQuadrada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numero = input.nextDouble();
		input.close();
	
		System.out.printf("%.2f%n",Math.sqrt(numero));

	}

}
