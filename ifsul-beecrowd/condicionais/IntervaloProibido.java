package condicionais;
import java.util.Scanner;


public class IntervaloProibido {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();		

		if(-4 <= numero && numero <= 4) {
			System.out.println("prohibited interval");
		}else {
			double formula = (5*numero+3)/ (Math.sqrt(Math.pow(numero, 2)-16));
			

				
				System.out.printf("%.3f%n", formula);				
		


			input.close();	
		}
		

	}

}
