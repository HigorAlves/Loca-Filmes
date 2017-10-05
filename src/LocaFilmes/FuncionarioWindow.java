package LocaFilmes;
import javax.swing.*;

public class FuncionarioWindow {
	private JTextField nome = new JTextField();
	private JTextField sobrenome = new JTextField();
	private JTextField idade = new JTextField();
	private JTextField cargo = new JTextField();
	private JTextField endereco = new JTextField();

	public int Cadastro(int id) {
		Object[] message = {
				"ID: "+id,
				"Nome:", nome,
				"Sobrenome:", sobrenome,
				"Idade:", idade,
				"Cargo:", cargo,
				"Endereço:", endereco
		};

		int option = JOptionPane.showConfirmDialog(null, message, "LocaFilmes | Cadastro Funcionario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
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

		int option = JOptionPane.showConfirmDialog(null, message, "LocaFilmes | Alterar Cadastro Funcionario", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (option == JOptionPane.OK_OPTION) {
			String aux = Tid.getText();
			int auxId = Integer.parseInt(aux);
			if (auxId <= id) {
				
			}else {
				JOptionPane.showMessageDialog(null, "Este Id não existe!", "ERROR", JOptionPane.ERROR_MESSAGE );
			}
		}
	}
}
