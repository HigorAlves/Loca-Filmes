package LocaFilmes;
import javax.swing.*;

public class FuncionarioWindow {
	public int Cadastro(int id) {
		JTextField nome = new JTextField();
		JTextField sobrenome = new JTextField();
		JTextField idade = new JTextField();
		JTextField cargo = new JTextField();
		JTextField endereco = new JTextField();

		Object[] message = {
				"ID: "+id,
				"Nome:", nome,
				"Sobrenome:", sobrenome,
				"Idade:", idade,
				"Cargo:", cargo,
				"Endereço:", endereco
		};

		int option = JOptionPane.showConfirmDialog(null, message, "LocaFilmes | Cadastro Cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (option == JOptionPane.OK_OPTION) {
			id++;
		}
		return id;
	}

	public void Alterar(int id) {
		JTextField Tid = new JTextField();

		Object[] message = {
				"Qual ID do usuario que deseja alterar?", Tid
		};

		int option = JOptionPane.showConfirmDialog(null, message, "LocaFilmes | Alterar Cadastro", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (option == JOptionPane.OK_OPTION) {
			String aux = Tid.getText();
			int auxId = Integer.parseInt(aux);
			if (auxId <= id) {
				System.out.println("Deu certooooo!");
			}
		}
	}
}
