package Model;

public class Funcionario extends Pessoa{
	private String cargo;
	private float salario;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Funcionario(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.endereco = endereco;
		this.cargo = cargo;
		this.salario = salario;
	}
}
