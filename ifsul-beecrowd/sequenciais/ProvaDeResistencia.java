package sequenciais;
import java.util.Scanner;

public class ProvaDeResistencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int horasPersistidas = input.nextInt();
		System.out.println(horasPersistidas*60+" minutos");
		input.close();
	}

}
