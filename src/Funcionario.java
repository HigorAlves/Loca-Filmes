
public class Funcionario extends Cliente {
	private float salario;
	private String senha;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void monstraFuncionario() {
	System.out.println("Nome: " + super.getNome());
	System.out.println("CPF: " + super.getCpf());
	System.out.println("Endereço: " + super.getEndereco());
	System.out.println("Telefone: " + super.getTelefone());
	System.out.println("Idade: " + super.getIdade());
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}