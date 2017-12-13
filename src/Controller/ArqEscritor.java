package Controller;

import Model.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import miscellaneous.Database;

/**
 * @author Higor Alves
 */
public class ArqEscritor {
    private static ArqEscritor instancia = null;
    private String cFileName = "";
    File cFile;
    
    private Cliente cliente;
    
    private ArqEscritor(){
    }
    
//Carregar arquivos para classe clientes.
    public void cLoad(String path){
        cFileName = path;
        cFile = new File(cFileName);
        try {
            Scanner input = new Scanner(cFile);
            input.nextLine();
            while(input.hasNext()) {
                Cliente cliente = new Cliente();
		String data = input.next(); //Pega linha toda
		String[] values = data.split(","); //Parte as partes da linha e joga no vetor de string
		cliente.setNome(values[0]);
        	cliente.setIdade(Integer.parseInt(values[1]));
                cliente.setId(Database.getInstancia().getClientes().size());
		Database.getInstancia().addData(cliente);
            }
            input.close();
	} catch (FileNotFoundException e) {
	}	
}

    //Salvar dados dos clientes no arquivo.
    public void cSave(List<Cliente> clientes, String path) {		
        cFileName = path;
        cFile = new File(cFileName);
        try {
            if(!cFile.exists()) {
                cFile.createNewFile();
            }
            FileWriter fw = new FileWriter(cFile.getAbsolutePath(), true);
            for (Cliente cli: clientes) {
                fw.append("\n");
		fw.append(cli.getNome());
		fw.append(",");
		fw.append(""+cli.getIdade());
            }
            fw.flush();
            fw.close();
	} catch (IOException e) {
            e.printStackTrace();
	}
    }
    
    public static ArqEscritor getInstancia(){
        if(instancia  == null){
            instancia = new ArqEscritor();
        }
        return instancia;
    }
}
