import java.util.List;
import java.util.Scanner;

public class Funcs {

	public void Listar(List<Cliente> clientes) {
		for (Cliente cli: clientes) {
			System.out.println("| ID: " + cli.getId() + " | Nome: " + cli.getNome());
		}
	}

	public void Excluir(List<Cliente> clientes, int j) {
		for (Cliente cli: clientes) {
			if (cli.getId() == j) {
				System.out.println("\n Cliente a ser deletado: ID: " + cli.getId() + " Nome: " + cli.getNome() + " Telefone: " + cli.getTelefone());
				clientes.remove(cli);
				System.out.println("Cliente deletado com sucesso.");
			}
		}
	}

	public void AlterarCadastro(List<Cliente> clientes, int j, Scanner scan) {
		for (Cliente cli: clientes) {
			if (cli.getId() == j) {
				System.out.print("Insira o novo nome: ");
				cli.setNome(scan.next());
				System.out.print("\nInsira o novo Endreço: ");
				cli.setEndereco(scan.next());
				System.out.print("\nInsira a nova Idade: ");
				cli.setIdade(scan.nextInt());
				System.out.print("\nInsira o novo Telefone: ");
				cli.setTelefone(scan.next());
				System.out.println("\nDados do Cliente atualizados com sucesso!");
			}
		}
	}

	public void AlugarFilme(List<Cliente> clientes,List<Filmes> filme, Scanner scan) {
		System.out.println("Qual ID do cliente que vai alugar?");
		int i = scan.nextInt();
		for (Cliente cli: clientes) {
			if (cli.getId() == i) {
				
			}
		}
	}
	
	public Cliente Cadastrar(int id, Cliente cliente, Scanner scan){
		cliente.setId(id);
        System.out.println("O ID do cliente sera: " + id);
		
        System.out.print("\nQual nome do Cliente? ");
        cliente.setNome(scan.next());
        
        System.out.print("Qual endereço? ");
        cliente.setEndereco(scan.next());
        
        System.out.print("Qual idade? ");
        cliente.setIdade(scan.nextInt());
        
        System.out.print("Qual o telefone? ");
        cliente.setTelefone(scan.next());
        
        System.out.print("Cliente cadastrado com Sucesso!");
        cliente.setComFilme(false);
        cliente.setDevendo(false);
        
        return cliente;
    }

	public Filmes CadastrarFilme(Filmes filme, Scanner scan) {
		System.out.print("Insira o Codigo do filme: ");
		filme.setCodigo(scan.nextInt());
		
		System.out.print("Insira o nome do filme: ");
		filme.setNome(scan.next());
		
		System.out.print("Insira a faixa etaria: ");
		filme.setFaixaEtaria(scan.nextInt());
		
		System.out.print("Insira as horas de duração: ");
		filme.setHoras(scan.nextInt());
		
		System.out.print("Insira os minutos de duração: ");
		filme.setMinutos(scan.nextInt());
		return filme;
	}
	
	public void ListarFilmes(List<Filmes> filmes) {
		for (Filmes filme: filmes) {
			System.out.println("Nome: " + filme.getNome());
		}
	}
	
	public void ExcluirFilme(List<Filmes> filmes, Scanner scan) {
		System.out.print("Insira o Codigo do filme que deseja deletar: ");
		int j = scan.nextInt();
		for (Filmes filme: filmes) {
			if (filme.getCodigo() == j) {
				filmes.remove(filme);
				System.out.println("O filme com ID " + j + " foi deletado com sucesso.");
			}
		}
	}
}
