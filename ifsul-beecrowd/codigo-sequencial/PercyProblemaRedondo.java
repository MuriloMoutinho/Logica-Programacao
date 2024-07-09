import java.util.Scanner;

public class PercyProblemaRedondo {

	public static void main(String[] args) {
		double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		input.close();
		
		double perimetro = raio*PI*2;
		double area = PI*Math.pow(raio,2);
		
		System.out.printf("%.2f%n", perimetro);
		System.out.printf("%.2f%n", area);

	}

}
