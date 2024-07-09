package condicionais;

import java.util.Scanner;

public class OndeEstaoSinais2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		if(numero == 0) {
			System.out.println("ZERO");
		}else if(numero > 0){
			System.out.println("POS");
		}else {
			System.out.println("NEG");
		}
		
		input.close();
	}

}
