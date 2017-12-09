package Interface;

import Model.Modelo;
import Model.Pessoa;
import View.View;

public abstract class AbsFactory {
	public abstract Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario, String faixaEtaria, String duracao, String tema);
	public abstract void criarController();
	public abstract View criarView();
	
	public static AbsFactory getFactory(String factory) {
		if(factory.equals("Funcionario")) {
			return new FuncionarioFactory();
		}if(factory.equals("Filme")) {
			return new FilmeFactory();
		}if(factory.equals("Cliente")){
			return new ClienteFactoryCadastro();
		}else {
			return null;
		}
	}
}
