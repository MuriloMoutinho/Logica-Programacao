package condicionais;

import java.util.Scanner;

public class MadeiraSuficiente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int packsMadeira = input.nextInt();
		if(packsMadeira > 30) {
			System.out.println(">30");
		}else if (packsMadeira == 30) {
			System.out.println("=30");
		}else {
			System.out.println("<30");
		}
		input.close();
	}

}
