package condicionais;

import java.util.Scanner;

public class DoadorSangue3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String VALIDACAO_VERDADEIRA = "yes";
		String VALIDACAO_FALSE = "no";
		
		int idade = input.nextInt();
		double peso = input.nextDouble();
		String fezJejum = input.next();
		String possuiDocumento = input.next();
		String teveHepatite = input.next();
		String teveMalaria = input.next();
		
		if((idade >= 16 &&  idade <= 69) 
				&& peso >= 50 
				&& fezJejum.equals(VALIDACAO_VERDADEIRA) 
				&& possuiDocumento.equals(VALIDACAO_VERDADEIRA)
				&& teveHepatite.equals(VALIDACAO_FALSE)
				&& teveMalaria.equals(VALIDACAO_FALSE)
				) {
			System.out.println("YES.");	
		}else {
			System.out.println("NO.");
		}
		
		input.close();
	}

}
