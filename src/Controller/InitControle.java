package Controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Interface.AbsFactory;
import View.ClienteView;
import View.FilmeView;
import View.FuncionarioView;
import View.View;

public class InitControle implements Controller {
	private View view;
	private JMenuItem button;
	private JDesktopPane desktop;
	
	public InitControle(View view, JMenuItem button, JDesktopPane desktop) {
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
		} else if (item.getText().equals("Filmes")){
			FilmeView view = (FilmeView)AbsFactory.getFactory("Filme").criarView();
			criarPane(view);
		}else if (item.getText().equals("Cadastrar")) {
			ClienteView view = (ClienteView)AbsFactory.getFactory("Cliente").criarView();
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
