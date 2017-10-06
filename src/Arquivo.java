import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;;

public class Arquivo {
	private String fileHeader = ("Nome, Sobrenome, Idade, Cargo");
	
	//Salvar arquivo em CSV
	public void save(){
		String fileName = "data.csv";
		File file = new File(fileName);
		
		Scanner input;
		try {
			input = new Scanner(file);
			while(input.hasNext()) {
				String data = input.next(); //Pega linha toda
				String[] values = data.split(",");
				System.out.println(values[0]);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Retornar dados do arquivo em CSV
	public void load(List<Cliente> clientes) {
		try {
			FileWriter filewriter = new FileWriter("data.csv");
			for (Cliente cli: clientes) {
				filewriter.append("\n");
				filewriter.append(cli.getNome());
				filewriter.append(",");
				filewriter.append(cli.getEndereco());
				filewriter.flush();
				filewriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
