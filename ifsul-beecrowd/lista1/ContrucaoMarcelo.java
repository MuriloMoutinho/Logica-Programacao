import java.util.Scanner;

public class ContrucaoMarcelo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		input.close();
		
		double distanciaPlanoCartesiano = Math.sqrt(Math.pow(x2-x1,2) - Math.pow(y2-y1,2)); 
		System.out.printf("%.2f%n", distanciaPlanoCartesiano);

	}

}
