package sequenciais;
import java.util.Scanner;

public class TemaCasa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int hora = input.nextInt();
		input.close();
		
		System.out.println(hora*60+ " minutos");

	}

}
