package Model;

public class Filme implements Modelo{
	private int id;
	private String nome;
	private String faixaEtaria;
	private String duracao;
	private String tema;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Filme(int id, String nome, String faixaEtaria, String duracao, String tema) {
		super();
		this.id = id;
		this.nome = nome;
		this.faixaEtaria = faixaEtaria;
		this.duracao = duracao;
		this.tema = tema;
	}
}
