package condicionais;

import java.util.Scanner;

public class DoadorSangue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();
		
		if(idade >= 16 &&  idade <= 69) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		input.close();
	}

}
