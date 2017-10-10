/**
 * Esta classe faz toda a interação do programa com as funções da classe Funcs.
 * Tornando todo o funcionamento do mesmo claro e limpo.
 * @author Higor Alves
 */

import java.util.List;
import java.util.Scanner;

public class CriarMenu {
	private int id;
	private int idf;
	
	public CriarMenu(int id, int idf) {
		setId(id);
		setIdf(idf);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdf() {
		return idf;
	}

	public void setIdf(int idf) {
		this.idf = idf;
	}

	//MENUS
	public void MenuPrincipal(List<Cliente> cliente, List<Filmes> filme, Funcs func, Scanner scan, List<Funcionarios> funcionarios, Arquivo arq){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes ----------");
			System.out.println("Escolha uma das opções a baixo:");
			System.out.println("1. Cliente");
			System.out.println("2. Filmes");
			System.out.println("3. Funcionarios");
			System.out.println("4. Arquivo");
			System.out.println("0. Sair do Programa");
			System.out.print("Opção: ");
			op = scan.nextInt();
			switch (op){
			case 1:
				MenuCliente(cliente, filme, func, scan);
				break;
			case 2:
				MenuFilme(filme, func, scan);
				break;
			case 3:
				MenuFuncionarios(scan, funcionarios, func);
				break;
			case 4:
				MenuArquivo(cliente, filme, funcionarios, arq, scan);
				break;
			case 0:
				System.out.println("Terminando o programa.");
				break;
			default:
				System.out.println("\nOpção inserida é invalida!");
				break;
			}
		}while (op != 0);
	}
	
	private void MenuCliente(List<Cliente> cliente, List<Filmes> filme, Funcs func, Scanner scan){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes | Clientes ----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir Cadastro");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Alugar Filmes");
			System.out.println("5. Devolver Filme");
			System.out.println("6. Exibir Cadastros");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Opção: ");
			op = scan.nextInt();
			System.out.println("---------------------------------");
			switch (op){
			case 1:
				Cliente clien = new Cliente();
				cliente.add(func.Cadastrar(id, clien, scan));
				id++;
				break;

			case 2:
				func.Excluir(cliente, scan);
				break;
			case 3:
				func.AlterarCadastro(cliente, scan);
				break;
			case 4:
				func.AlugarFilme(cliente, filme, scan);
				break;
			case 5:
				func.DevolverFilme(cliente, filme, scan);
				break;
			case 6: 
				func.Listar(cliente);
				break;
			case 0:
				System.out.println("Voltando ao menu principal.");
				break;
			default:
				System.out.println("\n Opção Invalida.");
				break;
			}
		}while (op != 0);
	}

	private void MenuFilme(List<Filmes> filmes, Funcs func, Scanner scan){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes | Filmes----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Exibir Filmes");
			System.out.println("0. Menu Principal");
			System.out.print("Opção: ");
			op = scan.nextInt();

			switch (op){
			case 1:
				Filmes filme = new Filmes();
				filmes.add(func.CadastrarFilme(filme, scan));
				break;
			case 2:
				func.ExcluirFilme(filmes, scan);
				break;
			case 3:
				func.AlterarFilme(filmes, scan);
				break;
			case 4:
				func.ListarFilmes(filmes);
				break;
			case 0:
				System.out.println("------------------------------");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
		}while (op != 0);
	}

	private void MenuFuncionarios(Scanner scan, List<Funcionarios> funcionarios, Funcs func){
		int op;
		do{
			System.out.println("\n---------- Loca Filmes | Funcionarios----------");
			System.out.println("1. Cadastrar");
			System.out.println("2. Excluir");
			System.out.println("3. Alterar Cadastro");
			System.out.println("4. Exibir Funcionarios");
			System.out.println("0. Menu Principal");
			System.out.print("Opção: ");
			op = scan.nextInt();
			switch (op){
			case 1:
				Funcionarios funcionario = new Funcionarios();
				funcionarios.add(func.CadastroFuncionario(idf, funcionario, scan));
				idf++;
				break;
			case 2:
				func.ExcluirFuncionario(funcionarios, scan);
				break;
			case 3:
				func.AlterarFuncionario(funcionarios, scan);
				break;
			case 4:
				func.ListarFuncionarios(funcionarios);
				break;
			case 0:
				System.out.println("------------------------------");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}
		}while (op != 0);
	}
	
	private void MenuArquivo(List<Cliente> clientes, List<Filmes> filmes, List<Funcionarios> funcionarios, Arquivo arq, Scanner scan) {
		int op;
		do{
			System.out.println("\n---------- Loca Filmes | Arquivo----------");
			System.out.println("1. Salvar Clientes");
			System.out.println("2. Carregar Clientes");
			System.out.println("3. Salvar Filmes");
			System.out.println("4. Carregar Filmes");
			System.out.println("5. Salvar Funcionarios");
			System.out.println("6. Carregar Funcionarios");
			System.out.println("0. Voltar ao iniciar");
			System.out.println("Opção: ");
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				arq.cSave(clientes);
				break;
			case 2:
				arq.cLoad(clientes);
				break;
			case 3:
				arq.fiSave(filmes);
				break;
			case 4:
				arq.fiLoad(filmes);
				break;
			case 5:
				arq.fuSave(funcionarios);
				break;
			case 6:
				arq.fuLoad(funcionarios);
				break;
			case 0:
				System.out.println("Voltando ao menu iniciar.");
				break;
			default:
				System.out.println("\nOpção inserida é invalida!");
				break;
			}
		}while (op != 0);
		
	}
}
