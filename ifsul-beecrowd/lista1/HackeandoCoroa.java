import java.util.Scanner;

public class HackeandoCoroa {
	
	private static double calculaPorcentual(int votos, int votosTotais) {
		return (double) (votos*100) / votosTotais;
	}
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int votosTotais = input.nextInt();
	int votosBrancos = input.nextInt();
	int votosNulos = input.nextInt();
	int votosValidos = input.nextInt();
	input.close();
	

	System.out.printf("%.1f (percentual de votos brancos)%n",calculaPorcentual(votosBrancos, votosTotais));
	System.out.printf("%.1f (percentual de votos nulos)%n",calculaPorcentual(votosNulos, votosTotais));
	System.out.printf("%.1f (percentual de votos validos)%n",calculaPorcentual(votosValidos, votosTotais));
	
	}
}
