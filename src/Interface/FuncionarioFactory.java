package Interface;

import Model.Funcionario;
import Model.Modelo;
import View.FuncionarioView;
import View.View;

public class FuncionarioFactory extends AbsFactory{

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
	public FuncionarioView criarView() {
		return FuncionarioView.getInstancia();
	}

}
