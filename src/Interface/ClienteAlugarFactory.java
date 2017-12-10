package Interface;

import javax.swing.JButton;

import Controller.Controller;
import Model.Modelo;
import Model.TableModel;
import View.ClienteAlugarView;
import View.View;

public class ClienteAlugarFactory extends AbsFactory {

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
	public Controller criarController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Controller criarController(View view, JButton button) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View criarView() {
		return ClienteAlugarView.getInstancia();
	}

}
