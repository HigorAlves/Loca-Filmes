package Interface;

import java.awt.EventQueue;

import View.Window;

public class Main {

	public static void main(String[] args) {
		Window window = (Window)MainFactory.initFactory("iniciar").criarView();
		window.setVisible(true);
	}

}
