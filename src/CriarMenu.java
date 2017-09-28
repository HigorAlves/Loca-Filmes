/**
 * Classe responsavel por fazer toda a iteração com as funções basicas do programa
 * @author Higor Alves
 */

import java.util.List;
import java.util.Scanner;

public class CriarMenu {
	private int i = 1, j=1;

	/**
	 * Metodo para criar menu principal chamando o menu de todos os outros metodos
	 */
	public void MenuPrincipal(List<Cliente> cliente, List<Filmes> filme, Funcs func, Scanner scan){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes ----------");
			System.out.println("Escolha uma das opções a baixo:");
			System.out.println("1. Cliente");
			System.out.println("2. Filmes");
			System.out.println("3. Funcionarios");
			System.out.println("0. Sair do Programa");
			System.out.print("Opção: ");
			op = scan.nextInt();
			switch (op){
			case 1:
				MenuCliente(cliente, filme, func, scan);
				break;
			case 2:
				MenuFilme(cliente, filme, func, scan);
				break;
			case 3:
				MenuFuncionarios();
				break;
			default:
				System.out.println("\nOpção inserida é invalida!");
				break;
			}
		}while (op != 0);
	}
	/**
	 * Metodo que cria e controla todas as funções do cliente
	 */
	private void MenuCliente(List<Cliente> cliente, List<Filmes> filme, Funcs func, Scanner scan){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes | Clientes ----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir Cadastro");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Alugar Filmes");
			System.out.println("5. Exibir Cadastros");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Opção: ");
			op = scan.nextInt();
			System.out.println("---------------------------------");
			switch (op){
			case 1:
				Cliente clien = new Cliente();
				cliente.add(func.Cadastrar(i, clien, scan));
				i++;
				break;

			case 2: //Pecorre a linkedList ate achar o cliente com o ID selecionado, apos achar o mesmo muda a variavel achou para true e deleta o cliente
				System.out.print("Insira o ID do cliente que deseja excluir: ");
				j = scan.nextInt();
				func.Excluir(cliente, j);
				break;
			case 3: //Alterar cadastro
				System.out.println("Insira o ID do cliente que quer alterar: ");
				j = scan.nextInt();
				func.AlterarCadastro(cliente, j, scan);
				break;
			case 4://Alugar Filme
				func.AlugarFilme(cliente, filme, scan);
				break;
			case 5: 
				//Listar(clientes);
				func.Listar(cliente);
				break;

			default:
				System.out.println("\n Opção Invalida.");
				break;
			}
		}while (op != 0);
	}

	private void MenuFilme(List<Cliente> cliente, List<Filmes> filmes, Funcs func, Scanner scan){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes ----------");
			System.out.println("----------Filmes----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Exibir Filmes");
			System.out.println("0. Menu Principal");
			System.out.print("Opção: ");
			op = scan.nextInt();
			System.out.println("------------------------------");
			switch (op){
			case 1:
				Filmes filme = new Filmes();
				filmes.add(func.CadastrarFilme(filme, scan));
				break;
			case 4:
				func.ListarFilmes(filmes);
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
		}while (op != 0);
	}

	private void MenuFuncionarios(){
		int op;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("\n---------- Loca Filmes ----------");
			System.out.println("---------- Administração ----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Exibir Funcionarios");
			System.out.println("0. Menu Principal");
			System.out.print("Opção: ");
			op = scan.nextInt();
			System.out.println("------------------------------");
			switch (op){
			case 1:
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
		}while (op != 0);
	}
}
