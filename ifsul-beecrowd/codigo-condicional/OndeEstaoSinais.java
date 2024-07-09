package condicionais;

import java.util.Scanner;

public class OndeEstaoSinais {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		if(numero < 0) {
			System.out.println("NEG");
		}else {
			System.out.println("POS");
		}
		input.close();
	}

}
