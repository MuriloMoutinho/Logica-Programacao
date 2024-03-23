import java.util.Scanner;

public class IdadeEmDia2 {

	public static void main(String[] args) {
		int DIAS_POR_ANO = 365;
		int DIAS_POR_MES = 30;
		
		Scanner input = new Scanner(System.in);
		int dias = input.nextInt();
		input.close();
		
        int anos = dias / DIAS_POR_ANO;
        int meses = (dias % DIAS_POR_ANO) / DIAS_POR_MES;
        int diasRestantes = (dias % DIAS_POR_ANO) % DIAS_POR_MES;
        
        System.out.println(anos + " ano(s), " + meses + " mes(es) e " + diasRestantes + " dia(s)");

	}
}
