package loca.filmes;

import java.util.Scanner;

public class Cliente extends Pessoas {
    private boolean comFilme;
    private String filme;
    private boolean devendo;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isComFilme() {
        return comFilme;
    }

    public void setComFilme(boolean comFilme) {
        this.comFilme = comFilme;
    }

    public boolean isDevendo() {
        return devendo;
    }

    public void setDevendo(boolean devendo) {
        this.devendo = devendo;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
    
    public void Cadastrar(int id){
        setId(id);
        Scanner scan = new Scanner(System.in);
        System.out.print("\nQual nome do Cliente? ");
        setNome(scan.next());
        System.out.print("\nQual endereço? ");
        setEndereco(scan.next());
        System.out.print("\nQual idade? ");
        setIdade(scan.nextInt());
        System.out.print("\nQual o telefone? ");
        setTelefone(scan.next());
        System.out.print("\nCliente cadastrado com Sucesso!");
        setComFilme(false);
        setDevendo(false);
    }
    
    public void Excluir(){
        
    }
}
