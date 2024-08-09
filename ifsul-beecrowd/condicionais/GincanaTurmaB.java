package condicionais;
import java.util.Scanner;


public class GincanaTurmaB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valorA = input.nextInt();		
		int valorB = input.nextInt();
		
		int somaA = valorA+valorB;
		if(somaA > 20) {
			System.out.println(somaA+8);
		}else {
			System.out.println(somaA-5);
		}
		
		input.close();
	}

}

