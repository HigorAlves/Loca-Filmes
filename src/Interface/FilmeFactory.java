package Interface;

import View.View;
import Model.Filme;
import Model.Modelo;
import Model.Pessoa;
import View.FilmeView;

public class FilmeFactory extends AbsFactory {

	@Override
	public void criarController() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public View criarView() {
		return FilmeView.getInstancia();
	}

	@Override
	public Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario, String faixaEtaria, String duracao, String tema) {
		return new Filme(id, nome, faixaEtaria, duracao, tema);
	}
}
