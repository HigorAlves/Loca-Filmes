package Interface;

import View.View;

import javax.swing.JButton;

import Controller.Controller;
import Controller.FilmeController;
import Model.Filme;
import Model.Modelo;
import Model.Pessoa;
import Model.TableModel;
import View.FilmeView;

public class FilmeFactory extends AbsFactory {

	@Override
	public Controller criarController(View fView, JButton button ) {
		return new FilmeController(fView, button);
	}
	
	@Override
	public View criarView() {
		return FilmeView.getInstancia();
	}

	@Override
	public Modelo criarModelo(int id, String nome, String faixaEtaria, String duracao, String tema) {
		return new Filme(id, nome, faixaEtaria, duracao, tema);
	}

	@Override
	public Modelo criarModelo(int id, String nome, String sobrenome, int idade, String endereco, String cargo,
			float salario) {
		return null;
	}

	@Override
	public Controller criarController() {
		// TODO Auto-generated method stub
		return null;
	}
}
