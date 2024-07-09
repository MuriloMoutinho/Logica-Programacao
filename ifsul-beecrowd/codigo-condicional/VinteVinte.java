package condicionais;
import java.util.Scanner;

public class VinteVinte {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();
		int IDADE_VIP = 20;
		
		if(idade == IDADE_VIP) {
			System.out.println("VIP");
		}else if(idade > IDADE_VIP) {
			System.out.println("ABEND");
		}else {
			System.out.println("TAG");
		}
		input.close();
	}

}
