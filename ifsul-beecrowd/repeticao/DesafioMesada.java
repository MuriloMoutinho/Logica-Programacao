package repeticao;

public class DesafioMesada {

	public static void main(String[] args) {
		
		int numerosUsados = 0;
		int soma = 0;
		for(int i = 2; i<=50; i +=2) {
			soma += i;
			numerosUsados++;
		}
		System.out.println(numerosUsados + " " + soma);

	}

}
