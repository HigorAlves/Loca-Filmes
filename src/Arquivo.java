import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;;

public class Arquivo {
	private String fCHeader = ("ID,Nome,Endereço,Idade,Telefone");
	private String fiHeader = ("Codigo,Nome,Faixa Etaria,Horas Duração,Minutos Duração");
	private String fuHeader = ("ID,Nome,Endereço,Idade,Telefone,Cargo,Salario");
	
	private String cFileName = "clientes.csv";
	private String fiFileName = "filmes.csv";
	private String fuFileName = "funcionarios.csv";
	
	File cFile = new File(cFileName);
	File fiFile = new File(fiFileName);
	File fuFile = new File(fuFileName);
	
	//Carregar arquivos para classe clientes.
	public void cLoad(List<Cliente> clientes){
		try {
			Scanner input = new Scanner(cFile);
			input.nextLine();
			while(input.hasNext()) {
				Cliente cliente = new Cliente();
				String data = input.next(); //Pega linha toda
				String[] values = data.split(","); //Parte as partes da linha e joga no vetor de string
				
				cliente.setId(Integer.parseInt(values[0]));
				cliente.setNome(values[1]);
				cliente.setEndereco(values[2]);
				cliente.setIdade(Integer.parseInt(values[3]));
				cliente.setTelefone(values[4]);
				
				clientes.add(cliente);
			}
			input.close();
			System.out.println("Clientes carregados com sucesso.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

	//Salvar dados dos clientes no arquivo.
	public void cSave(List<Cliente> clientes) {		
		try {
			if(!cFile.exists()) {
				cFile.createNewFile();
			}
			
			FileWriter fw = new FileWriter(cFile.getAbsolutePath(), true);
			
			fw.append(fCHeader);
			for (Cliente cli: clientes) {
				fw.append("\n");
				fw.append(""+cli.getId());
				fw.append(",");
				fw.append(cli.getNome());
				fw.append(",");
				fw.append(cli.getEndereco());
				fw.append(",");
		        fw.append(""+cli.getIdade());
		        fw.append(",");
		        fw.append(cli.getTelefone());
			}
			
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Todos os Clientes foram salvos no arquivo.");
	}
	
	public void fiLoad(List<Filmes> filmes) {
		try {
			Scanner input = new Scanner(fiFile);
			input.nextLine();
			
			while(input.hasNext()) {
				Filmes filme = new Filmes();
				String data = input.next();
				String[] values = data.split(",");
				
				filme.setCodigo(Integer.parseInt(values[0]));
				filme.setNome(values[1]);
				filme.setFaixaEtaria(Integer.parseInt(values[2]));
				filme.setHoras(Integer.parseInt(values[3]));
				filme.setMinutos(Integer.parseInt(values[4]));
				
				filmes.add(filme);
			}
			
			input.close();
			System.out.println("Filmes carregados com sucesso.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void fiSave(List<Filmes> filme) {
		try {
			if(!fiFile.exists()) {
				fiFile.createNewFile();
			}
			
			FileWriter fw = new FileWriter(fiFile.getAbsolutePath(), true);
			fw.append(fiHeader);
			
			for (Filmes fi: filme) {
				fw.append("\n");
				fw.append("" + fi.getCodigo());
				fw.append(",");
				fw.append(fi.getNome());
				fw.append(",");
				fw.append("" + fi.getFaixaEtaria());
				fw.append(",");
				fw.append("" + fi.getHoras());
				fw.append(",");
				fw.append("" + fi.getMinutos());
			}
			fw.flush();
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Todos os Filmes foram salvos com sucesso.");
	}
	
	public void fuLoad(List<Funcionarios> funcionarios) {
		Scanner input = new Scanner(fuFileName);
		input.nextLine();
		
		while(input.hasNext()) {
			Funcionarios funcionario = new Funcionarios();
			String data = input.next();
			String[] values = data.split(",");
			
			funcionario.setId(Integer.parseInt(values[0]));
			funcionario.setNome(values[1]);
			funcionario.setEndereco(values[2]);
			funcionario.setIdade(Integer.parseInt(values[3]));
			funcionario.setTelefone(values[4]);
			funcionario.setCargo(values[5]);
			funcionario.setSalario(Float.parseFloat(values[6]));
			funcionarios.add(funcionario);
		}
		input.close();
		System.out.println("Filmes carregados com sucesso.");
	}
	
	public void fuSave(List<Funcionarios> funcionarios) {
		try {
			if(!fuFile.exists()) {
				
			}
			
			FileWriter fw = new FileWriter(fuFile.getAbsolutePath(), true);
			fw.append(fuHeader);
			//"ID,Nome,Endereço,Idade,Telefone,Cargo,Salario");
			for (Funcionarios funcionario: funcionarios) {
				fw.append("\n");
				fw.append("" + funcionario.getId());
				fw.append(",");
				fw.append(funcionario.getNome());
				fw.append(",");
				fw.append(funcionario.getEndereco());
				fw.append(",");
				fw.append("" + funcionario.getIdade());
				fw.append(",");
				fw.append(funcionario.getTelefone());
				fw.append(",");
				fw.append(funcionario.getCargo());
				fw.append(",");
				fw.append("" + funcionario.getSalario());
			}
			fw.flush();
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
