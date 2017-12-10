package Interface;

import javax.swing.JButton;

import Controller.Controller;
import Model.Funcionario;
import Model.Modelo;
import View.FilmeView;
import View.FuncionarioView;
import View.View;

public class FuncionarioFactory extends AbsFactory{
	@Override
	public Controller criarController() {
		return null;
	}

	@Override
	public FuncionarioView criarView() {
		return FuncionarioView.getInstancia();
	}

	@Override
	public Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo,
			float salario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modelo criarModelo(int id, String nome, String faixaEtaria, String duracao, String tema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Controller criarController(View fView, JButton button) {
		// TODO Auto-generated method stub
		return null;
	}

}
