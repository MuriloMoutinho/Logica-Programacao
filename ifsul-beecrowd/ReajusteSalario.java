import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double salario = input.nextDouble();
		double reajuste = input.nextDouble();
		input.close();
		
		double salarioAjustado = salario * (reajuste/100 +1);
		System.out.printf("R$%.2f",salarioAjustado);

	}

}
