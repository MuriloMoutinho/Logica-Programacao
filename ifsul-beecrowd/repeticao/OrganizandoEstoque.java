package repeticao;

import java.util.Scanner;

public class OrganizandoEstoque {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nProdutos = input.nextInt();
		int maiorEstoque = 0;
		String produtoMaiorEstoque = "";
		
		for(int i = 0; i < nProdutos; i++) {
			String nome = input.next();
			int prod = input.nextInt();
			int venda = input.nextInt();
			
			int estoque = prod-venda;
			System.out.println(nome);
			
			if(estoque < 50) {
				System.out.println(estoque);
				System.out.println("Alert!!!");
			}else {
				System.out.println(estoque);
			}
			
			if(estoque > maiorEstoque) {
				produtoMaiorEstoque = nome;
				maiorEstoque = estoque;
				}
			}
		System.out.println(produtoMaiorEstoque + ": " + maiorEstoque);
		}

}

