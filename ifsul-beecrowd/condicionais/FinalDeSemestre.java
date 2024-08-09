package condicionais;
import java.util.Scanner;

public class FinalDeSemestre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double notaA = input.nextDouble();		
		double notaB = input.nextDouble();
		double notaC = input.nextDouble();
		
		double mediaNotas = (notaA+notaB+notaC)/3;
		
		if(mediaNotas < 6) {
			System.out.println("FAILED");
		}else if(mediaNotas >= 6 && mediaNotas <= 6.9){
			System.out.println("RETAKE");
		}else if(mediaNotas >= 7 && mediaNotas <= 8){
			System.out.println("APPROVED, BUT YOU CAN DO BETTER");
		}else if(mediaNotas >= 8.1 && mediaNotas < 9.7){
			System.out.println("APPROVED");
		}else {
			System.out.println("APPROVED, CONGRATULATIONS");
		}
		
		input.close();

	}

}
