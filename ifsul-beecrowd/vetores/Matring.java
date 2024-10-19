package vetores;

import java.util.Scanner;

public class Matring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] matring = new String[4];
		matring[0] = input.next();
		matring[1] = input.next();
		matring[2] = input.next();
		matring[3] = input.next();
		
		int indexUltimaColuna = matring[0].length() - 1;
		
		/*
		 * Refatoração mais performática; Pois ao usar concatenação de strings puras, uma nova instancia da classe String é criada, atribuindo-a novamente a variável
		 * Ao usar o StringBuilder, apenas uma instancia de String é criada. E os métodos manipulam a instancia criada, usando uma abordagem mais semelhante aos códigos
		 * orientados a objetos. Sem criar novas instancias de String ao concatenar, para fazer novas atribuições na varáveis; Semelhante aos conceitos de imutabilidade 
		 * do paradigma de programação funcional
		 * 
StringBuilder primeiroNumeroBuilder = new StringBuilder();
StringBuilder segundoNumeroBuilder = new StringBuilder();

primeiroNumeroBuilder.append(matring[0].charAt(0))
                      .append(matring[1].charAt(0))
                      .append(matring[2].charAt(0))
                      .append(matring[3].charAt(0));

segundoNumeroBuilder.append(matring[0].charAt(indexUltimaColuna))
                     .append(matring[1].charAt(indexUltimaColuna))
                     .append(matring[2].charAt(indexUltimaColuna))
                     .append(matring[3].charAt(indexUltimaColuna));
		 */
		
		String primeiroNumeroString = "";
		String ultimoNumeroString = "";
		for(int i = 0; i < 4; i++) {
			primeiroNumeroString += matring[i].charAt(0);
			ultimoNumeroString += matring[i].charAt(indexUltimaColuna);
		}
		int primeiroNumero = Integer.parseInt(primeiroNumeroString); 
		int ultimoNumero = Integer.parseInt(ultimoNumeroString);
	
		
		String palavra = "";
		for(int i = 1; i < indexUltimaColuna; i++) {
			String numero = "";
			
			for(int x = 0; x < 4; x++) {
				numero += matring[x].charAt(i); 
			}
			palavra += (char) ((primeiroNumero * Integer.parseInt(numero) + ultimoNumero) % 257); 
		}
		
		System.out.println(palavra);
		
		input.close();
	}

}
