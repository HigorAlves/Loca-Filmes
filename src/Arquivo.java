import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;;

public class Arquivo {
	private String fHeader = ("ID,Nome,Endereço,Idade,Telefone");
	String fileName = "data.csv";
	File file = new File(fileName);
	
	//Carregar arquivos para classe clientes.
	public void load(List<Cliente> clientes){
		try {
			Scanner input = new Scanner(file);
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
	public void save(List<Cliente> clientes) {		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsolutePath(), true);
			
			fw.append(fHeader);
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
}
