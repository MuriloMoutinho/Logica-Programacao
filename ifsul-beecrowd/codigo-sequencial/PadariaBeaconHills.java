import java.util.Scanner;

public class PadariaBeaconHills {

	public static void main(String[] args) {
		double VALOR_PAO = 0.12;
		double VALOR_BISCOITO = 1.50;
		double POUPANCA = 0.10;
		
		Scanner input = new Scanner(System.in);
		int pao = input.nextInt();
		int biscoito = input.nextInt();
		input.close();
		
		double valorPao = pao*VALOR_PAO;
		double valorBiscoito = biscoito*VALOR_BISCOITO;
		double valorTotal = valorPao + valorBiscoito;
		double valorPoupanca = valorTotal *POUPANCA;
		
		System.out.printf("%.2f%n", valorTotal );
		System.out.printf("%.2f%n", valorPoupanca);
		

	}

}
