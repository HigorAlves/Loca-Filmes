package Controller;

import Model.Cliente;
import Model.Filme;
import miscellaneous.Database;
import miscellaneous.FabricaAbstrata;

/**
 * @author Higor Alves
 */
public class FilmeController implements Controller{
     private Filme filme;
    
    public boolean addRow(String titulo, int faixaEtaria){
        try{
            if (titulo.equals("")){
                return false;
            }else{
                filme = (Filme)FabricaAbstrata.getFabrica("filme").criarModelo();
                filme.setId(Database.getInstancia().getClienteId());
                filme.setNome(titulo);
                filme.setFaixaEtaria(faixaEtaria);
                filme.setAlugado(false);
            
                if (Database.getInstancia().addData(filme)){
                    Database.getInstancia().setFilmeId(1);
                }else {
                    return false;
                }
           }
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    public boolean removerRow(int id){
        Database.getInstancia().removeData(id);
        return true;
    }
    public boolean alterarRow(int id, String nome, int idade, String newNome, int newIdade){
        cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setIdade(idade);
        
        if (Database.getInstancia().editData(cliente)){
            int index = Database.getInstancia().getClientes().indexOf(cliente);
            cliente.setNome(newNome);
            cliente.setIdade(newIdade);
            Database.getInstancia().getClientes().set(index, cliente);
            return true;
        }
        return false;
    }
    
    public void salvarArq(){
        ArqEscritor.getInstancia().cSave(Database.getInstancia().getClientes());
    }
    public void abrirArq(String path){
        ArqEscritor.getInstancia().cLoad(path);
        int index = Database.getInstancia().getClientes().size();
        Database.getInstancia().setClienteId(index);
    }
}
