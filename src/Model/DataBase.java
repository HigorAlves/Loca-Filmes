package Model;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
	private static DataBase instancia = null;
	
	private List funcionarios;
	private List clientes;
	private List filmes;
	
	private DataBase() {
		funcionarios = new LinkedList<Funcionario>();
		clientes = new LinkedList<Cliente>();
		filmes = new LinkedList<Filme>();
	}
	
	public static DataBase getInstance() {
		if (instancia == null) {
			instancia = new DataBase();
		}
		return instancia;
	}
}
