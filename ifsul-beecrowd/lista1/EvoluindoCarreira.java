import java.util.Scanner;

public class EvoluindoCarreira {

	public static void main(String[] args) {
			int QUILO_PARA_GRAMA = 1000;
			double PORCENTAGEM_ENGORDADO = 1.12;
			
			Scanner input = new Scanner(System.in);
			int peso = input.nextInt();
			int pesoExtra= input.nextInt();
			input.close();
			
			int pesoGrama = peso * QUILO_PARA_GRAMA;	
			double pesoParaEngordar = peso * PORCENTAGEM_ENGORDADO;
			double pesoEngordado = pesoParaEngordar * (1+((double)pesoExtra/100));

			
			System.out.printf("Gramas = %dg%n", pesoGrama);
			System.out.printf("Peso depois dos 12%% = %.2fkg%n", pesoParaEngordar);
			System.out.printf("Peso final = %.2fkg%n", pesoEngordado);
		}
	
}
