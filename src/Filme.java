
public class Filme {
	private String nome;
	private String genero;
	private int duracao;
	private int idademin;
	private int codigofilme;
	private int nfilmesdisponiveis;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getIdademin() {
		return idademin;
	}

	public void setIdademin(int idademin) {
		this.idademin = idademin;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String tipo) {
		this.genero = tipo;
	}

	public void exibeFilmes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Genero: " + this.genero);
		System.out.println("Duração (em minutos): " + this.duracao);
		System.out.println("Idade mínima para alugar o filme: " + this.idademin);
		System.out.println("Quantidade Disponível: " + this.nfilmesdisponiveis);
	}

	public int getCodigofilme() {
		return codigofilme;
	}

	public void setCodigofilme(int codigofilme) {
		this.codigofilme = codigofilme;
	}

	public int getNfilmesdisponiveis() {
		return nfilmesdisponiveis;
	}

	public void setNfilmesdisponiveis(int nfilmesdisponiveis) {
		this.nfilmesdisponiveis = nfilmesdisponiveis;
	}
}
