package condicionais;

import java.util.Scanner;

public class DoadorSangue2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();
		double peso = input.nextDouble();
		
		if((idade >= 16 &&  idade <= 69) && peso >= 50) {
			System.out.println("YES");	
		}else {
			System.out.println("NO");
		}
		
		input.close();
	}

}
