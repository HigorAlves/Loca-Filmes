package Model;

public class Cliente extends Pessoa{
	public Cliente(int id, String nome, String sobrenome, int idade, String endereco) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.endereco = endereco;
	}
}
