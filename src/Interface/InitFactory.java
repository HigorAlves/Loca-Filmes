package Interface;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

import Controller.Controle;
import Controller.Controller;
import View.View;
import View.Window;

public class InitFactory extends MainFactory{

	@Override
	public View criarView() {
		return Window.getInstancia();
	}

	@Override
	public Controller criarController(View fView, JMenuItem button, JDesktopPane desktop) {
		return new Controle(fView, button, desktop);
	}

}
