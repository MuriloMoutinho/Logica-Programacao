package repeticao;

import java.util.Scanner;

public class ViagemAcapulco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] numeros = new int[1000]; 
        int indice = 0;

        while (true) {
            int num = input.nextInt();
            if (num < 0) break; 
            numeros[indice] = num;
            indice++;  
        }

        int soma = 0;
        int menor = numeros[0];
        int maior = numeros[0];
        int totalValores = indice;
        int menorEntre100e1000 = numeros[0];
        int totalEntre100e1000 = 0;
        double somaEntre100e1000 = 0.0;

        for (int i = 0; i < indice; i++) {
            int num = numeros[i];
            soma += num;
            
            if (num < menor) menor = num;
            if (num > maior) maior = num;
            if (num >= 100 && num <= 1000) {
            	if (num < menorEntre100e1000) menorEntre100e1000 = num;	
                totalEntre100e1000++;
                somaEntre100e1000 += num;
            }
        }
        
        if (totalEntre100e1000 == 0) {
            System.out.println("No values between 100 and 1000");
        } else {
            System.out.println(menorEntre100e1000);
            System.out.println(somaEntre100e1000 / totalEntre100e1000); 
            System.out.println((int) somaEntre100e1000); 
        }

        System.out.println(soma);
        System.out.println(menor);
        System.out.println(maior);
        System.out.println(totalValores);


        input.close();
	}

}
