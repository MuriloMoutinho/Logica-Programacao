package condicionais;

import java.util.Scanner;

public class DVDsAntonio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tipoDvd = input.next();
		int numeroDvds = input.nextInt();
		float valorTipoDvd = 0;
		
		switch(tipoDvd) {
		  case "Pink":
			  valorTipoDvd = 25;
		    break;
		  case "Green":
			  valorTipoDvd = 35;
		    break;
		  case "Blue":
			  valorTipoDvd = 10;
		    break;
		  case "Red":
			  valorTipoDvd = 50;
		    break;
		}		
			
		float valorFinal = valorTipoDvd*numeroDvds;
		
		System.out.println(numeroDvds);
		System.out.printf("%.2f%n", valorTipoDvd);
		System.out.printf("%.2f%n", valorFinal);

		input.close();
	}

}
