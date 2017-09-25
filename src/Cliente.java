
public class Cliente {
	private int limitefilmesalugados = 3;
	private int numerofilmesaludagos;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private int idade;
	Filme[] filmealugado = new Filme[limitefilmesalugados];

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void mostraInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Idade: " + this.idade);
	}

	public int getNumerofilmesaludagos() {
		return numerofilmesaludagos;
	}

	public void setNumerofilmesaludagos(int numerofilmesaludagos) {
		this.numerofilmesaludagos = numerofilmesaludagos;
	}
}
