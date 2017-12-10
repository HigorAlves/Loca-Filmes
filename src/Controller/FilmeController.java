package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Interface.FilmeFactory;
import Model.DataBase;
import Model.Filme;
import View.FilmeView;
import View.View;

public class FilmeController implements Controller, ActionListener{
	FilmeFactory filmeFactory;
	
	private View fView;
	private JButton button;
	
	public FilmeController(View fView, JButton button) {
		this.fView = fView;
		this.button = button;
	}

	
	public void Cadastrar(int id, String nome, String faixaEtaria, String duracao, String tema) {
		DataBase database = DataBase.getInstance();
		database.addFilme((Filme) filmeFactory.criarModelo(id, nome, faixaEtaria, duracao, tema));
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		if(item.getText().equals("Salvar")) {
			System.out.println("OLAAAAAAAA");
		}
	}
}
