package sequenciais;
import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioMinimo = input.nextDouble();
		double salarioRecebido = input.nextDouble();
		input.close();
		
		double quantidadeSalarioMinimo = salarioRecebido/salarioMinimo;
		System.out.printf("%.2f salário(s) mínimo(s)",quantidadeSalarioMinimo);

	}

}
