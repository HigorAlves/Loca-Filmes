package Model;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
	private static DataBase instancia = null;
	
	private List<Funcionario> funcionarios;
	private List<Cliente> clientes;
	private List<Filme> filmes;
	
	private DataBase() {
		funcionarios = new LinkedList<Funcionario>();
		clientes = new LinkedList<Cliente>();
		filmes = new LinkedList<Filme>();
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void addFilme(Filme filme) {
		filmes.add(filme);
	}
	
	public static DataBase getInstance() {
		if (instancia == null) {
			instancia = new DataBase();
		}
		return instancia;
	}
}
