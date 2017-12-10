package Interface;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

import Controller.InitControle;
import Controller.Controller;
import View.View;
import View.MainView;

public class InitFactory extends AbsMainFactory{

	@Override
	public View criarView() {
		return MainView.getInstancia();
	}

	@Override
	public Controller criarController(View fView, JMenuItem button, JDesktopPane desktop) {
		return new InitControle(fView, button, desktop);
	}

}
