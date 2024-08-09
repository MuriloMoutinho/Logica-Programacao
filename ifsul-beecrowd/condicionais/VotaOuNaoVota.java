package condicionais;
import java.util.Scanner;

public class VotaOuNaoVota {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = input.nextInt();
		
		if(idade < 16) {
			System.out.println("Nao eleitor");
		}else if(idade >= 18 && idade <=64) {
			System.out.println("Eleitor obrigatorio");
		}else if(idade >= 65 || (idade >= 16 && idade <= 17)) {
			System.out.println("Eleitor facultativo");
		}
		
		input.close();
	}
}
