package Interface;

import javax.swing.JButton;

import Controller.Controller;
import Controller.FuncionarioController;
import Model.Funcionario;
import Model.Modelo;
import Model.TableModel;
import View.FuncionarioView;
import View.View;

public class FuncionarioFactory extends AbsFactory{
	@Override
	public Controller criarController() {
		return null;
	}

	@Override
	public View criarView() {
		return FuncionarioView.getInstancia();
	}

	@Override
	public Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo, float salario) {
		return new Funcionario(id, nome, sobrenome, idade, endereco, cargo, salario);
	}

	@Override
	public Modelo criarModelo(int id, String nome, String faixaEtaria, String duracao, String tema) {
		return null;
	}

	@Override
	public Controller criarController(View view, JButton button) {
		return new FuncionarioController(view, button);
	}

}
