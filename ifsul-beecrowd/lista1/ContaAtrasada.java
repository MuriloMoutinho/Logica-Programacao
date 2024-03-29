public class ContaAtrasada {

	public static void main(String[] args) {
		int salario = 1200;
		int contaLuz = 200;
		int contaAgua = 120;
		
		double multasTotais = (contaLuz*1.02)+(contaAgua*1.02);
		double salarioFinal = salario-multasTotais;
		
		System.out.printf("$%.2f%n",salarioFinal);
	}
}
