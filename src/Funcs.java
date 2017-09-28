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

	public void AlugarFilme(List<Cliente> clientes) {
		for (Cliente cli: clientes) {

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
}
