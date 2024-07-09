import java.util.Scanner;

public class IdadesEmDia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int DIAS_POR_ANO = 360;
		int DIAS_POR_MES = 30;
		
		int dia, mes, ano;
		dia = input.nextInt();
		mes = input.nextInt();
		ano = input.nextInt();

		System.out.println((dia)+(mes*DIAS_POR_MES)+(ano * DIAS_POR_ANO));
		
		input.close();
	}

}
