import java.util.Scanner;

public class Voltorbs {

	public static void main(String[] args) {
		double PI = 3.1415926;
		
		Scanner input = new Scanner(System.in);
		double raio = input.nextDouble();
		input.close();
		
		System.out.printf("Area = %.2f%n", PI*Math.pow(raio,2));
	}

}
