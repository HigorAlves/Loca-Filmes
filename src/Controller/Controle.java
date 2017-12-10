package Controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Interface.AbsFactory;
import View.FuncionarioView;
import View.View;

public class Controle implements Controller {
	private View view;
	private JMenuItem button;
	private JDesktopPane desktop;
	
	public Controle(View view, JMenuItem button, JDesktopPane desktop) {
		this.view = view;
		this.button = button;
		this.desktop = desktop;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem item = (JMenuItem) e.getSource();
		if(item.getText().equals("Funcionario")) {
			FuncionarioView view = (FuncionarioView)AbsFactory.getFactory("Funcionario").criarView();
			criarPane(view);
		}
	}
	
	private void criarPane(JInternalFrame view) {
		try {
			desktop.add(view);
			view.setVisible(true);
		}catch(IllegalArgumentException error){
			desktop.remove(view);
			desktop.add(view);
			view.setVisible(true);
		}
	}

}
