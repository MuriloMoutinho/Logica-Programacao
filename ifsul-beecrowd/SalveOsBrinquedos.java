import java.util.Scanner;

public class SalveOsBrinquedos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double valorOriginal;
		valorOriginal = input.nextFloat();
		
		double desconto = valorOriginal*0.09;
		double valorComDesconto = valorOriginal-desconto;
				
		System.out.printf("Valor original do produto: R$%.2f%n", valorOriginal);
		System.out.printf("Valor final do produto: R$%.2f%n", valorComDesconto);
		System.out.printf("Valor do desconto: R$%.2f%n", desconto);
		input.close();
	}

}
