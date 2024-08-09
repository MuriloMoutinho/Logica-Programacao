package sequenciais;
import java.util.Scanner;

public class AvancoTecnologia {

	public static void main(String[] args) {
		double VALOR_MULTA = 0.10;
		double DVDS_ESTRAGADOS = 0.02;
		int DVDS_ATRASADOS = 10;
		int DVDS_ALUGADOS = 3;
		int DVDS_REPOSTOS = 10;
		int MESES_NO_ANO = 12;
		
		Scanner input = new Scanner(System.in);
		int dvds = input.nextInt();
		double valorAluguel = input.nextDouble();
		input.close();
		
		// 1/3 alugado por mes
		// 1/10 sao devolvidos com atraso no mes, 10% de multa sobre o valor do aluguel
		// 2 estragam no ano, 1/10 contando depois do vencimento é reposto 
		
		double dvdsAlugados = (double) dvds/DVDS_ALUGADOS;
		
		double dvdsAtrasados = dvdsAlugados/DVDS_ATRASADOS;
		double valorMultasAnuais = dvdsAtrasados*(VALOR_MULTA*valorAluguel)*MESES_NO_ANO;
		
		double dvdsEstragados = (double) dvds*DVDS_ESTRAGADOS;
		double dvdsFinalAno = dvds - dvdsEstragados;
		double dvdsTotaisRepostos = Math.floor(dvdsFinalAno/DVDS_REPOSTOS + dvdsFinalAno);
		
		double faturamentoAlugueisAnual = dvdsAlugados * valorAluguel * MESES_NO_ANO; 
		double faturamentoFinal = faturamentoAlugueisAnual + valorMultasAnuais;		
		
		System.out.printf("%.2f%n", faturamentoFinal);
		System.out.printf("%.2f%n", valorMultasAnuais);
		System.out.printf("%.0f%n",dvdsTotaisRepostos);
	}

}

