package Interface;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Window extends JFrame{
	private JPanel pane;
	private JDesktopPane desktopPane;
	
	private JMenuBar menuBar;
	
	private JMenu mFuncionario;
	private JMenuItem miCadastrar;
	private JMenuItem miEditar;
	
	private JMenu mFilmes;
	private JMenuItem miFCadastrar;
	private JMenuItem miFEditar;
	
	private JMenu mCliente;
	private JMenuItem miCCadastrar;
	private JMenuItem miCEditar;
	private JMenuItem miCAlugar;
	
	public Window() {
		super("Loca Filmes");
		
		setSize(1400, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pane = new JPanel();
		pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pane);
		pane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		pane.add(desktopPane);
		
		setJMenuBar(criarMenuBar());
		actions();
	}
	
	private JMenuBar criarMenuBar() {
		menuBar = new JMenuBar();
		
		//MENU FUNCIONARIO
		mFuncionario = new JMenu("Funcionario");
		miCadastrar = new JMenuItem("Cadastrar");
		miEditar = new JMenuItem("Editar");
		mFuncionario.add(miCadastrar);
		mFuncionario.add(miEditar);
		
		//MENU FILMES
		mFilmes = new JMenu("Filmes");
		miFCadastrar = new JMenuItem("Cadastrar");
		miFEditar = new JMenuItem("Editar");
		mFilmes.add(miFCadastrar);
		mFilmes.add(miFEditar);
		
		//MENU CLIENTE
		mCliente = new JMenu("Cliente");
		miCCadastrar = new JMenuItem("Cadastrar");
		miCEditar = new JMenuItem("Editar");
		miCAlugar = new JMenuItem("Alugar");
		mCliente.add(miCCadastrar);
		mCliente.add(miCEditar);
		mCliente.add(miCAlugar);
		
		menuBar.add(mFuncionario);
		menuBar.add(mFilmes);
		menuBar.add(mCliente);
		
		return menuBar;
	}
	
	private void actions() {
		miCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					desktopPane.add(JFuncionarioCadastrar.getInstancia());
					JFuncionarioCadastrar.getInstancia().setVisible(true);
				}catch(IllegalArgumentException ERROR) {
					desktopPane.remove(JFuncionarioCadastrar.getInstancia());
					desktopPane.add(JFuncionarioCadastrar.getInstancia());
					JFuncionarioCadastrar.getInstancia().setVisible(true);
				}
			}
		});
	}
	
	public void createFrame() {
		Window frame = new Window();
		frame.setVisible(true);
	}
}
