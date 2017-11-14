package LocaFilmes;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class InternalFuncionario extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InternalFuncionario frame = new InternalFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InternalFuncionario() {
		setBounds(100, 100, 339, 210);
		
		JButton btnTeste = new JButton("teste");
		getContentPane().add(btnTeste, BorderLayout.CENTER);
		
	}

}
