import java.util.Scanner;

public class Girafales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		int arvores = input.nextInt();
		int alunos = input.nextInt();
		input.close();
		int arvoresAlunos = arvores/alunos;
		int arvoresProfessor = arvores% alunos;
		
		System.out.println(arvoresAlunos);
		System.out.println(arvoresProfessor);
	}

}
