package Interface;

import View.View;
import Model.Pessoa;
import View.FilmeView;

public class FilmeFactory extends AbsFactory {

	@Override
	public Pessoa criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void criarController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public View criarView() {
		return FilmeView.getInstancia();
	}

}
