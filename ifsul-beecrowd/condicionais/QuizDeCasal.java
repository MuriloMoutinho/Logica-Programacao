package condicionais;
import java.util.Scanner;


public class QuizDeCasal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pontoA = input.nextInt();
		int pontoB = input.nextInt();
		int pontoC = input.nextInt();
		int pontoD = input.nextInt();
		
		int somaA = pontoA + pontoB;
		int somaB = pontoC + pontoD;
		
		if(somaA == somaB) {
			System.out.println(pontoA+" + "+pontoB+" = "+ somaA);
			System.out.println(pontoC+" + "+pontoD+" = "+ somaB);
		}else {
			System.out.println(somaA);
			System.out.println(somaB);
		}
		
		input.close();
	}

}
