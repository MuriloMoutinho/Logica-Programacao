package Trabalhos;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		String[][] banco = new String[4][10];		
		Scanner input = new Scanner(System.in);
		
		int opcao;
		do {
			imprimirOpcoes();
			opcao = input.nextInt();
			imprimirAcao(opcao, input, banco);
			
		} while (opcao != 0);
		
		input.close();
	}

	
	private static int cadastrarProduto(String[][] banco, String codigo, String descricao, String quantidade, String preco) {
		//Para apenas iterar 1 vez na matriz
		//Deve iterar sobre todos os itens para validar codigos repetidos
		int lugarVazioNoBanco = -1;
		
		for(int x = 0; x < 10; x++) {
			if(banco[0][x] == null) {
				if(lugarVazioNoBanco == -1) {
					lugarVazioNoBanco = x;					
				}
			}else {
				if(banco[0][x].equals(codigo)) return 0;  // JA EXISTE				
			}
		}
		if(lugarVazioNoBanco != -1) {
			banco[0][lugarVazioNoBanco] = codigo;
			banco[1][lugarVazioNoBanco] = descricao;
			banco[2][lugarVazioNoBanco] = quantidade;
			banco[3][lugarVazioNoBanco] = preco;
			return 1; // OK	
		}
		return -1; // SEM MEMORIA
	}
		
	
	private static int excluirProduto(String[][] banco, String codigo) {
		for(int x = 0; x < 10; x++) {
			if(banco[0][x] != null) {
				if(banco[0][x].equals(codigo)) {
					banco[0][x] = null;
					banco[1][x] = null;
					banco[2][x] = null;
					banco[3][x] = null;
					return 1; // OK
				}	
			}			
		}
		return -1; // NAO EXISTE
	}
	
	private static void imprimirProdutos(String[][] banco) {
		for(int x = 0; x < 10; x++) {
			if(banco[0][x] != null) {
				System.out.println("----------");
				System.out.println("Código: " + banco[0][x]);
				System.out.println("Produto: " + banco[1][x]);
				System.out.println("Quantidade: " + banco[2][x]);
				System.out.println("Preço: " + banco[3][x]);
				System.out.println("----------");	
			}
		}
	}
	
	private static int venderProduto(String[][] banco, String codigo, String quantidade) {
		int quantidadeN = Integer.valueOf(quantidade);
		if(quantidadeN <= 0) return -3; // QUANTIDADE <= 0
		
		for(int x = 0; x < 10; x++) {
			if(banco[0][x] != null) {
				if(banco[0][x].equals(codigo)) {
					int quantidadeProdutoN = Integer.valueOf(banco[2][x]);
					
					if(quantidadeProdutoN < quantidadeN) return -1; // NAO HA QUANTIDADE
					
					banco[2][x] = String.valueOf(quantidadeProdutoN - quantidadeN);
					return 1; // OK		
				}
			}
		}
		
		return -2; // NAO EXISTE
	}
	
	private static void imprimirMensagem(String acao, int resposta) {
		switch(acao) {
		  case "CADASTRAR":
			  switch(resposta) {
				  case 1:
					  System.out.println("Produto cadastrado com sucesso."); 
				    break;
				  case 0:
					  System.out.println("ERRO: Produto já cadastrado no sistema!");
				    break;
				  case -1:
					  System.out.println("ERRO: Não há memória disponível para realizar o cadastro!");
			  	}			 
		    break;
		  case "EXCLUIR":
			  switch(resposta) {
				  case 1:
					  System.out.println("Produto excluído com sucesso."); 
				    break;
				  case -1:
					  System.out.println("ERRO: Produto não existe no sistema!");
			  	}			 
		    break;
		  case "VENDER":
			  switch(resposta) {
				  case 1:
					  System.out.println("Venda realizada com suceso."); 
				    break;
				  case -1:
					  System.out.println("ERRO: Não existe quantidade em estoque suficiente para a realizar a venda!"); 
				    break;
				  case -2:
					  System.out.println("ERRO: Produto não cadastrado!"); 
				    break;
				  case -3:
					  System.out.println("ERRO: Quantidade inválida!"); 
				    break;
				  }			 
			  break;
		  default:
			  System.out.println("ERRO! Parâmetros informados incorretamente!");
		  }		
	}	
	
	
	private static void imprimirOpcoes() {
		System.out.println("-----");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - EXCLUIR");
		System.out.println("3 - VENDER");
		System.out.println("4 - LISTAR");
		System.out.println("0 - SAIR");
		System.out.println("-----");
	}
	private static void imprimirAcao(int opcao, Scanner input, String[][] banco) {
		switch(opcao) {
		  case 1:
			  System.out.println("Insira o código, nome, quantidade e preço do produto");
			  String codigoCad = input.next();
			  String nome = input.next();
			  String quantidade = input.next();
			  String preco = input.next();
			  int respostaCad = cadastrarProduto(banco, codigoCad, nome, quantidade, preco);
			  imprimirMensagem("CADASTRAR", respostaCad);
			  break;
		  case 2:
			  System.out.println("Insira o código do produto");
			  String codigoExc = input.next();
			  int respostaExc = excluirProduto(banco, codigoExc);
			  imprimirMensagem("EXCLUIR", respostaExc);
			  break;
		  case 3:
			  System.out.println("Insira o código e quantida do produto vendido");
			  String codigoVen = input.next();
			  String quantidadeVen = input.next();
			  int respostaVen = venderProduto(banco, codigoVen, quantidadeVen);
			  imprimirMensagem("VENDER", respostaVen);
			  break;
		  case 4:
			  imprimirProdutos(banco);			  
			  break;
		}
	}
}
