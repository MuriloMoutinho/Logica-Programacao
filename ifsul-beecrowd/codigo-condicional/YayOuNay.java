package condicionais;
import java.util.Scanner;


public class YayOuNay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double produtoA = input.nextDouble();
		double produtoB = input.nextDouble();
		double produtoC = input.nextDouble();
		
		double somaProdutos = produtoA + produtoB + produtoC;
		if(somaProdutos == 100) {
			System.out.println("100.00");
		}else {
			System.out.printf("%.2f%n", produtoA);
			System.out.printf("%.2f%n", produtoB);
			System.out.printf("%.2f%n", produtoC);

		}
		
		input.close();
	}

}

