import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LocaFilmes {

	public static void main(String[] args) {
		List<Cliente> clientes = new LinkedList<>();
		List<Filmes> filme = new LinkedList<>();
		List<Funcionarios> funcionarios = new LinkedList<>();
		Funcs func = new Funcs();
		Scanner scan = new Scanner(System.in);
		CriarMenu menu = new CriarMenu(1,1);
		menu.MenuPrincipal(clientes, filme, func, scan, funcionarios);
	}

}
