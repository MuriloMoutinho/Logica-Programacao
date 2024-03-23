import java.util.Scanner;

public class PlanoDeHiram {

	public static void main(String[] args) {
		double LITROS_GARRAFA_P = 0.35;
		double LITROS_GARRAFA_M = 0.60;
		double LITROS_GARRAFA_G = 2;
		
		int garrafaP, garrafaM, garrafaG;
		Scanner input = new Scanner(System.in);
		garrafaP = input.nextInt();
		garrafaM = input.nextInt();
		garrafaG = input.nextInt();
		
		double somaLitros = 
				(garrafaP*LITROS_GARRAFA_P)+
				(garrafaM*LITROS_GARRAFA_M)+
				(garrafaG*LITROS_GARRAFA_G);
				
		System.out.println("Total de litros comprados: " + somaLitros);

		input.close();
	}

}

