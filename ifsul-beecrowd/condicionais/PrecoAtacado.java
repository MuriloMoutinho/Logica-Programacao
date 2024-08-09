package condicionais;

import java.util.Scanner;

public class PrecoAtacado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NUMERO_MINIMO_PRODUTOS_DESCONTO = 20;
		int numeroProdutos = input.nextInt();
		if(numeroProdutos >= NUMERO_MINIMO_PRODUTOS_DESCONTO) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		input.close();
	}

}
