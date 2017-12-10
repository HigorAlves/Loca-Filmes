package Controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import Model.Funcionario;
import Model.TabelaFuncionarioModel;
import Model.TableModel;
import View.View;

public class FuncionarioController implements Controller{
	private View view;
	private JButton button;
	
	public FuncionarioController(View view, JButton button) {
		this.view = view;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		if(item.getText().equals("Salvar")) {
			Funcionario func = new Funcionario(1, "Hito4 QLF3W", null, 0, null, null, 0);
		}
	}

}
