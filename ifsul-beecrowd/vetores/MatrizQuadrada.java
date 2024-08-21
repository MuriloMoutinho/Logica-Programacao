package vetores;

import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        while (true) {
            int N = input.nextInt();
            if (N == 0) {
                break;
            }

            int[][] matriz = new int[N][N];

            for (int i = 0; i < (N + 1) / 2; i++) {
                for (int j = i; j < N - i; j++) {
                    matriz[i][j] = i + 1;
                    matriz[j][i] = i + 1;
                    matriz[N - i - 1][j] = i + 1;
                    matriz[j][N - i - 1] = i + 1;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j > 0) {
                        System.out.print(" ");
                    }
                    System.out.printf("%3d", matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
		input.close();
	}

}
