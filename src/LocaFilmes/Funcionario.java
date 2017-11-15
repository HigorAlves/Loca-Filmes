package LocaFilmes;

public class Funcionario extends Pessoa {
	private String Cargo;
	private String Salario;
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getSalario() {
		return Salario;
	}
	public void setSalario(String salario) {
		Salario = salario;
	}
	
}
