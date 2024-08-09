package condicionais;

import java.util.Scanner;

public class IdadeConvidado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int idade = input.nextInt();
		if(idade >= 18) {
			System.out.println("+18");
		}else {
			System.out.println("-18");
		}
		
		input.close();
	}

}
