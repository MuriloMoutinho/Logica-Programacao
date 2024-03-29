import java.util.Scanner;

public class CalendarioVingador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int dia = input.nextInt();
		int mes = input.nextInt();
		int ano = input.nextInt();
		input.close();
		
		System.out.println(dia+"/"+mes+"/"+ano);

	}

}
