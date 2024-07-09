import java.util.Scanner;

public class QuadraPoliesportiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double largura = input.nextDouble();
		double altura = input.nextDouble();
		input.close();
		
		double area = altura*largura;
		
		System.out.printf("%.2f%n",area);
	}

}
