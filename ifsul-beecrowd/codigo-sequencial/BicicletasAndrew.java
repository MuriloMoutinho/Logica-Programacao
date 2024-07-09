import java.util.Scanner;

public class BicicletasAndrew {

	public static void main(String[] args) {
		double COMISSAO_BICICLETA = 0.15;
		double LUCRO_BICICLETA = 0.50;
		double SALARIO_MINIMO_POR_FUNCIONARIO = 2;
		
		Scanner input = new Scanner(System.in);
		int numeroFuncionarios = input.nextInt();
		int numeroBicicletasVendidas = input.nextInt();
		double salarioMinimo = input.nextDouble();
		double custoBicicletas = input.nextDouble();
		input.close();
		
		double salarioMinimoParaFuncionarios = salarioMinimo * SALARIO_MINIMO_POR_FUNCIONARIO;
		double valorVendaBicicletas = custoBicicletas * numeroBicicletasVendidas;
		
		double salarioTotalFuncionarios = 
			 	(valorVendaBicicletas * COMISSAO_BICICLETA)/numeroFuncionarios +
				salarioMinimoParaFuncionarios;
		
		double lucroLoja = 
				(valorVendaBicicletas * LUCRO_BICICLETA) -
				(salarioTotalFuncionarios*numeroFuncionarios);
		
		System.out.printf("Salario = R$%.2f%n", salarioTotalFuncionarios);
		System.out.printf("Lucro = R$%.2f%n", lucroLoja);
		

	}

}
