import java.util.Scanner;

public class AlmocoBarato {

	public static void main(String[] args) {
		double VALOR_ALMOCO = 12;
		
		Scanner input = new Scanner(System.in);
		double kgComida = input.nextDouble();
		input.close();
		
		double conta = kgComida*VALOR_ALMOCO;
		
		System.out.printf("%.2f%n", conta);

	}

}
