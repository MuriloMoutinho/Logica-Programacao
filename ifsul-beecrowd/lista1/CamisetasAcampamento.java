import java.util.Scanner;

public class CamisetasAcampamento {

	public static void main(String[] args) {
		int PRECO_P = 10;
		int PRECO_M = 12;
		int PRECO_G = 15;
		
		Scanner input = new Scanner(System.in);
		int p = input.nextInt();
		int m = input.nextInt();
		int g = input.nextInt();
		input.close();
		
	 	double valorCompra = (p*PRECO_P)+(m*PRECO_M)+(g*PRECO_G);
		
		System.out.printf("%.0f%n", valorCompra);
	}

}
