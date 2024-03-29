import java.util.Scanner;

public class PiscinasAlternativas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double altura = input.nextDouble();
		input.close();
		
		double areaTriangulo = (base*altura)/2;
		double areaLosango = areaTriangulo*2;
		
		System.out.printf("%.2f%n", areaTriangulo);
		System.out.printf("%.2f%n", areaLosango);

	}

}
