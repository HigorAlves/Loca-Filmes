package View;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Interface.AbsFactory;
import Interface.InitFactory;
import Interface.AbsMainFactory;

public class MainView extends JFrame implements View{
	private static MainView instancia = null;
	
	private JPanel pane;
	private JDesktopPane desktopPane;
	
	private JMenuBar menuBar;
	
	private JMenu mFuncionario;
	private JMenuItem miTela;
	
	private JMenu mFilmes;
	private JMenuItem miFTela;
	
	private JMenu mCliente;
	private JMenuItem miCTela;
	private JMenuItem miCAlugar;
	
	private MainView() {
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
		miTela = new JMenuItem("Funcionario");
		mFuncionario.add(miTela);
		
		//MENU FILMES
		mFilmes = new JMenu("Filmes");
		miFTela = new JMenuItem("Filmes");
		mFilmes.add(miFTela);
		
		//MENU CLIENTE
		mCliente = new JMenu("Cliente");
		miCTela = new JMenuItem("Cadastrar");
		miCAlugar = new JMenuItem("Alugar");
		mCliente.add(miCTela);
		mCliente.add(miCAlugar);
		
		menuBar.add(mFuncionario);
		menuBar.add(mFilmes);
		menuBar.add(mCliente);
		
		return menuBar;
	}
	
	private void actions() {
		miTela.addActionListener(AbsMainFactory.initFactory("iniciar").criarController(this, miTela, desktopPane));
		miFTela.addActionListener(AbsMainFactory.initFactory("iniciar").criarController(this, miFTela, desktopPane));
		miCTela.addActionListener(AbsMainFactory.initFactory("iniciar").criarController(this, miCTela, desktopPane));
		miCAlugar.addActionListener(AbsMainFactory.initFactory("iniciar").criarController(this, miCAlugar, desktopPane));
	}
	
	public static MainView getInstancia() {
		if (instancia == null) {
			instancia = new MainView();
		}
		return instancia;
	}
}
