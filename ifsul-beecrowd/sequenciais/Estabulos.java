package sequenciais;
import java.util.Scanner;

public class Estabulos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double lado = input.nextDouble();
		input.close();
		
		double area= Math.pow(lado, 2);
		double perimetro = lado*4;
		
		System.out.printf("%.2f%n",perimetro);
		System.out.printf("%.2f%n",area);
		
	}

	}


