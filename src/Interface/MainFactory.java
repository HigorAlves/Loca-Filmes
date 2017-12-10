package Interface;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

import Controller.Controller;
import View.View;

public abstract class MainFactory {
	public abstract View criarView();
	public abstract Controller criarController(View fView, JMenuItem button, JDesktopPane desktop);
	
	public static MainFactory initFactory(String factory) {
		if (factory.equals("iniciar")) {
			return new InitFactory();
		}
		return null;
	}
}
