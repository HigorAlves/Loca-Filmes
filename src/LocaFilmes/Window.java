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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel guiPane;
	private JMenuBar menuBar;
	
	//OPÇÕES DO MENU
	private JMenu funcionarios;
	private JMenu filmes;
	private JMenu clientes;
	
	private JMenuItem visualizar;
	private JDesktopPane desktopPane;
	

	protected JMenuBar createMenuBar() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		funcionarios = new JMenu("Funcionarios");
		filmes = new JMenu("Filmes");
		visualizar = new JMenuItem("Visualizar");
		clientes = new JMenu("Clientes");
		funcionarios.add(visualizar);
		menuBar.add(funcionarios);
		menuBar.add(filmes);
		menuBar.add(clientes);
		
		actions();
		
		return menuBar;
	}
	
	public void actions() {
		visualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InternalFuncionario internalFunc = new InternalFuncionario();
				desktopPane.add(internalFunc);
				internalFunc.show();
			}
		});
	}
	
	public Window() {
		super("Loca Filmes");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 304);
		guiPane = new JPanel();
		guiPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(guiPane);
		guiPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		guiPane.add(desktopPane);
		setJMenuBar(createMenuBar());
	}

	public void createFrame() {
		Window frame = new Window();
		frame.setVisible(true);
	}
}
