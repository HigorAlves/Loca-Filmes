package Interface;

import View.View;
import Model.Modelo;
import Model.Pessoa;
import View.ClienteView;

public class ClienteFactoryCadastro extends AbsFactory{

	@Override
	public Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo,
			float salario, String faixaEtaria, String duracao, String tema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void criarController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public View criarView() {
		return ClienteView.getInstancia();
	}

}
