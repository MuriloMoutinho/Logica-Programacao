import java.util.Scanner;

public class CarroOvo {

	public static void main(String[] args) {
		double DESCONTO = 0.09;
		Scanner input = new Scanner(System.in);
		double valorOvo = input.nextDouble();
		input.close();
		double valorComDesconto = valorOvo * DESCONTO;
		double valorFinalOvo = valorOvo - valorComDesconto;
		
		System.out.printf("R$ %.2f%n", valorFinalOvo);
		
	}

}
