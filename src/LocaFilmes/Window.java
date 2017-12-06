package LocaFilmes;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

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
	private JMenu sistema;
	
	private JMenuItem visualizar;
	private JMenuItem configuracoes;
	private JDesktopPane desktopPane;
	

	protected JMenuBar createMenuBar() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		funcionarios = new JMenu("Funcionarios");
		filmes = new JMenu("Filmes");
		clientes = new JMenu("Clientes");
		sistema = new JMenu("Sistema");
		
		visualizar = new JMenuItem("Visualizar");
		configuracoes = new JMenuItem("Configurações");
		
		funcionarios.add(visualizar);
		sistema.add(configuracoes);
		
		menuBar.add(funcionarios);
		menuBar.add(filmes);
		menuBar.add(clientes);
		menuBar.add(sistema);
		
		actions();
		return menuBar;
	}
	
	public void actions() {
		visualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean existe = true;
				try {
					 JInternalFrame[] frames = desktopPane.getAllFrames();
					 for (int i = 0; i <= frames.length; i++) {
						 if (frames[i].getTitle() == "Funcionarios") {
							 frames[i].dispose();
						 }else {
							 existe = false;
						 }
					 }
					 if (!existe) {
						 InternalFuncionario internalFunc = new InternalFuncionario();
						 desktopPane.add(internalFunc);
						 internalFunc.show(); 
					 }	
				} catch (ArrayIndexOutOfBoundsException error) {
					InternalFuncionario internalFunc = new InternalFuncionario();
					desktopPane.add(internalFunc);
					internalFunc.show(); 
				}	
			}
		});
	}
	
	public Window() {
		super("Loca Filmes");
		
		setSize(1400, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
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
