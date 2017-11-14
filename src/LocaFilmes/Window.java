package LocaFilmes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	
	//OPÇÕES DO MENU
	private JMenu funcionarios;
	private JMenu filmes;
	private JMenu clientes;
	
	/**
	 * Create the frame.
	 */
	public Window() {
		super("Loca Filmes");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Menus
		funcionarios = new JMenu("Funcionarios");
		filmes = new JMenu("Filmes");
		clientes = new JMenu("Clientes");
		menuBar.add(funcionarios);
		menuBar.add(filmes);
		menuBar.add(clientes);
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
