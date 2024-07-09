package condicionais;

import java.util.Scanner;

public class AlunosPatricia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		input.close();
	}

}
