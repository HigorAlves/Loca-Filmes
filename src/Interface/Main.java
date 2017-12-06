package Interface;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		Window window = new Window();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.createFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
