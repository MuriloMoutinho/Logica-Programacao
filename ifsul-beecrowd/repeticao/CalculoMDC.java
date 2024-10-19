package repeticao;

import java.util.Scanner;

public class CalculoMDC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		int numero = input.nextInt();
		for(int i = 0; i < numero; i++) {
			int num1, num2;
			num1 = input.nextInt();
			num2 = input.nextInt();
			
	        while (num2 != 0) {
	        	int num2Reserva = num2;
	            num2 = num1 % num2;
	            num1 = num2Reserva;
	        }

			System.out.println(num1);
			
				
			}
			input.close();
		

	}

}
