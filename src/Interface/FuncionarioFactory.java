package Interface;

import Model.Funcionario;
import View.FuncionarioView;

public class FuncionarioFactory extends AbsFactory{

	@Override
	public Funcionario criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario) {
		return new Funcionario(id, nome, sobrenome, idade, endereco, cargo, salario);
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
