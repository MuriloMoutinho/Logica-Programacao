package condicionais;
import java.util.Scanner;

public class CoragemIndomavel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		if(numero % 5 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		input.close();

	}

}
