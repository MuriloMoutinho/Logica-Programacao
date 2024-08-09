package condicionais;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String SEXO_MASCULINO = "man";
		
		double altura = input.nextDouble();
		String sexo = input.next();
		
		double pesoIdeal; 
		if(sexo.equalsIgnoreCase(SEXO_MASCULINO)) {
			pesoIdeal = (72.2 * altura) - 58; 
		}else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		System.out.printf("%.2f%n", pesoIdeal);
		input.close();
	}

}
