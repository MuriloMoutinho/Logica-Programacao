import java.util.Scanner;

public class GorjetaGunther {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double conta = input.nextDouble();
		input.close();
		double contaComGorjeta = conta*1.10;
		System.out.printf("$%.2f%n", contaComGorjeta);
	}

}
