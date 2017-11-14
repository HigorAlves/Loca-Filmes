package LocaFilmes;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class InternalFuncionario extends JInternalFrame {
	
	private JPanel guiPane;
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
		setClosable(true);
		setTitle("Funcionarios");
		setResizable(true);
		setMaximizable(true);
		setBounds(100, 100, 339, 210);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		
		guiPane = new JPanel();
		guiPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(guiPane);
		guiPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
