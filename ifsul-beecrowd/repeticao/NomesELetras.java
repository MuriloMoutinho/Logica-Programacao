package repeticao;

import java.util.Scanner;

public class NomesELetras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = input.nextLine();
		
		for(int i = 0; i<nome.replace(" ", "").length(); i++) {
			System.out.println(nome);
		}
		
		input.close();
	}

}
