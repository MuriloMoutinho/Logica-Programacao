package repeticao;

import java.util.Scanner;

public class AvaliandoFilmes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pessoasAvaliadas = input.nextInt();
		
		int numeroAvaliacaoPublico = 0;
		for(int i = 0; i<pessoasAvaliadas; i++) {
			int idade = input.nextInt();
			int notaFilme = input.nextInt();
			
			if(idade>=40 && notaFilme >=10) {
				numeroAvaliacaoPublico++;
			}
		}
		System.out.println(numeroAvaliacaoPublico);
		input.close();
	}

}
