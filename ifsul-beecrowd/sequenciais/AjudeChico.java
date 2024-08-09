package sequenciais;
import java.util.Scanner;

public class AjudeChico {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double largura = input.nextDouble();
		double altura = input.nextDouble();
		input.close();
		
		double perimetro = (altura+largura)*2;
		double area = altura*largura;
		double diagonal = Math.sqrt(Math.pow(altura, 2)+Math.pow(largura, 2));
		
		System.out.printf("%.1f%n",perimetro);
		System.out.printf("%.1f%n",area);
		System.out.printf("%.2f%n",diagonal);
	}

}
