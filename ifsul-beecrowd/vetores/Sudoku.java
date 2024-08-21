package vetores;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroDeMatrizes = input.nextInt();
		
		for(int i = 0; i < numeroDeMatrizes; i++) {
			int[][] matriz = new int[9][9];			
			boolean matrizPossuiErro = false;

			for(int y = 0; y < 9 && !matrizPossuiErro; y++) {
				boolean[] numerosPresentes = new boolean[9];
				
				for(int x = 0; x < 9; x++) {
					int numeroInput = input.nextInt();
					numerosPresentes[numeroInput - 1] = true;
					matriz[y][x] = numeroInput;				
				}
				
				for (boolean existeNumero : numerosPresentes) {
					if(!existeNumero) {
						matrizPossuiErro = true;
						break;
					}
				}
			}
			for(int y = 0; y < 9 && !matrizPossuiErro; y++) {
				boolean[] numerosPresentes = new boolean[9];
				
				for(int x = 0; x < 9; x++) {
					numerosPresentes[matriz[x][y]-1] = true;
				}
				for (boolean existeNumero : numerosPresentes) {
					if(!existeNumero) {
						matrizPossuiErro = true;
						break;
					}
				}
			}
			
			
	        for (int blocoY = 0; blocoY < 3 && !matrizPossuiErro; blocoY++) {
                for (int blocoX = 0; blocoX < 3 && !matrizPossuiErro; blocoX++) {
                    boolean[] numerosPresentes = new boolean[9];
                    
                    for (int y = 0; y < 3; y++) {
                        for (int x = 0; x < 3; x++) {
                            int numero = matriz[blocoY * 3 + y][blocoX * 3 + x];
                            numerosPresentes[numero - 1] = true;
                        }
                    }
                	for (boolean existeNumero : numerosPresentes) {
    					if(!existeNumero) {
    						matrizPossuiErro = true;
    						break;
    					}
    				}
                }		
        	}
			
			
			if(matrizPossuiErro) {
				System.out.println("Instancia " + (i+1));
				System.out.println("NAO");
				System.out.println("");
			}else {
				System.out.println("Instancia " + (i+1));
				System.out.println("SIM");
				System.out.println("");
			}
			
		}
					
		input.close();
	}
}
	
	