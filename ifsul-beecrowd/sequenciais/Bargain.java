package sequenciais;
import java.util.Scanner;

public class Bargain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salarioFixo, valorVendas;
		salarioFixo = input.nextDouble();
		valorVendas= input.nextDouble();
		
		double comissao = valorVendas*0.04;
		double salarioFinal = salarioFixo+comissao;
		System.out.printf("Comissao = R$%.2f%n", comissao);
		System.out.printf("Salario Final = R$%.2f%n", salarioFinal);
	
		input.close();
	}

}