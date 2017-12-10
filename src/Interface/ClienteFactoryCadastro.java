package Interface;

import View.View;

import javax.swing.JButton;

import Controller.Controller;
import Model.Modelo;
import Model.Pessoa;
import Model.TableModel;
import View.ClienteView;
import View.FilmeView;

public class ClienteFactoryCadastro extends AbsFactory{

	@Override
	public Controller criarController() {
		return null;
	}

	@Override
	public View criarView() {
		return ClienteView.getInstancia();
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
