package miscellaneous;

import Model.Cliente;
import Model.Filme;
import Model.Locacao;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Higor Alves
 */
public class Database {
    private static Database instancia = null;
    
    private int clienteId;
    private int filmeId;
    private int locacaoId;
    private List<Cliente> clientes;
    private List<Filme> filmes;
    private List<Locacao> locacoes;
    
    private Database(){
        clientes = new LinkedList<>();
        filmes = new LinkedList<>();
        locacoes = new LinkedList<>();
        clienteId = 0;
        filmeId = 0;
        locacaoId = 0;
    }
    
    //METODOS CLIENTES
    public int getClienteId(){
        return this.clienteId;
    }
    public void setClienteId(int id){
        this.clienteId = id;
    }
    
    public void setClientes(List<Cliente> clientes){
        this.clientes.addAll(clientes);
    }
    public List<Cliente> getClientes(){
        return clientes;
    }  
    public boolean addData(Cliente cliente){
        return clientes.add(cliente);
    }
    public boolean removeData(int id){
        for (Cliente c: this.clientes){
            if (c.getId() == id){
                this.clientes.remove(c);
                return true;
            }
        }
        return false;
    }    
    public boolean editData(Cliente cliente){
        if(clientes.contains(cliente)){
            return true;
        }
        return false;
    }
    
    //METODOS FILMES
    
    //METODOS LOCACAO
    
    public static Database getInstancia(){
        if (instancia == null){
            instancia = new Database();
        }
        return instancia;
    }
}
