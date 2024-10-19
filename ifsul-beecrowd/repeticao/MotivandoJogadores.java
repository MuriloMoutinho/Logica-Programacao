package repeticao;

import java.util.Scanner;

public class MotivandoJogadores {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int classe = input.nextInt();
            if (classe < 1 || classe > 7) {
                break;
            }
            double salario = input.nextDouble();

            double salarioFinal = salario;
            switch (classe) {
                case 1:
                    salarioFinal += salario * 1.00;
                    break;
                case 2:
                    salarioFinal += salario * 0.80;
                    break;
                case 3:
                    salarioFinal += salario * 0.50;
                    break;
                case 4:
                    salarioFinal += salario * 0.30;
                    break;
                case 5:
                    salarioFinal += salario * 0.10;
                    break;
                case 6:
                    salarioFinal += salario * 0.05;
                    break;
                case 7:
                    break;
            }
            System.out.printf("%.2f%n", salarioFinal);
        }

        input.close();

	}

}
