package condicionais;

import java.util.Scanner;

public class DoadorSangue5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String FEZ_JEJUM = "YES";
		int idade = input.nextInt();
		double peso = input.nextDouble();
		String fezJejum = input.next();
		
		if((idade >= 16 &&  idade <= 69) && peso >= 50 && fezJejum.equals(FEZ_JEJUM)) {
			System.out.println("YES");	
		}else {
			System.out.println("NO");
		}
		
		input.close();
	}

}
