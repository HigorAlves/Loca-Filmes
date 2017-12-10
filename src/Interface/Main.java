package Interface;

import java.awt.EventQueue;

import View.MainView;

public class Main {

	public static void main(String[] args) {
		MainView window = (MainView)AbsMainFactory.initFactory("iniciar").criarView();
		window.setVisible(true);
	}

}
