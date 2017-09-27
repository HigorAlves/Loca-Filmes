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
        System.out.println("O ID do cliente sera: " + id);
		Scanner scan = new Scanner(System.in);
        System.out.print("\nQual nome do Cliente? ");
        setNome(scan.next());
        System.out.print("Qual endereço? ");
        setEndereco(scan.next());
        System.out.print("Qual idade? ");
        setIdade(scan.nextInt());
        System.out.print("Qual o telefone? ");
        setTelefone(scan.next());
        System.out.print("Cliente cadastrado com Sucesso!");
        setComFilme(false);
        setDevendo(false);
    }
    
}
