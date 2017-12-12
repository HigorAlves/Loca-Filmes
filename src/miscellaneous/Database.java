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
    
    private int id;
    private Set<Cliente> clientes;
    private Set<Filme> filmes;
    private Set<Locacao> locacoes;
    
    private Database(){
        clientes = new TreeSet<>();
        filmes = new TreeSet<>();
        locacoes = new TreeSet<>();
        id = 0;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id += id;
    }
    
    public Set<Cliente> getClientes(){
        return clientes;
    }
    
    public boolean addData(Cliente cliente){
        return clientes.add(cliente);
    }
    
    public void addData(Filme filme){
        
    }
    
    public void addData(Locacao locacao){
        
    }
    
    public void removeData(int id){
        for (Cliente c: clientes){
            if (c.getId() == id){
                this.clientes.remove(c);
            }
        }
    }
    
    public void removeData(Filme filme){
        
    }
    
    public void removeData(Locacao locacao){
        
    }
    
    public boolean editData(Cliente cliente, String nome, int idade){
        if(clientes.contains(cliente)){
            cliente.setNome(nome);
            cliente.setIdade(idade);
            return true;
        }
        return false;
    }
    
    public boolean editData(Filme filme, String nome){
        if(filmes.contains(filme)){
            filme.setNome(nome);
            return true;
        }
        return false;
    }
        
    public static Database getInstancia(){
        if (instancia == null){
            instancia = new Database();
        }
        return instancia;
    }
}
