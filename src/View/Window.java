package View;

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

import Interface.AbsFactory;

public class Window extends JFrame{
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
		miTela = new JMenuItem("Visualizar");
		mFuncionario.add(miTela);
		
		//MENU FILMES
		mFilmes = new JMenu("Filmes");
		miFTela = new JMenuItem("Tela");
		mFilmes.add(miFTela);
		
		//MENU CLIENTE
		mCliente = new JMenu("Cliente");
		miCTela = new JMenuItem("Tela");
		miCAlugar = new JMenuItem("Alugar");
		mCliente.add(miCTela);
		mCliente.add(miCAlugar);
		
		menuBar.add(mFuncionario);
		menuBar.add(mFilmes);
		menuBar.add(mCliente);
		
		return menuBar;
	}
	
	private void actions() {
		miTela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FuncionarioView view = (FuncionarioView)AbsFactory.getFactory("Funcionario").criarView();;
				try {
					desktopPane.add(view);
					view.setVisible(true);
				}catch(IllegalArgumentException error) {
					desktopPane.remove(view);
					desktopPane.add(view);
					view.setVisible(true);
				}
			}
		});
		miCTela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClienteView view = (ClienteView)AbsFactory.getFactory("Cliente").criarView();
				try {
					desktopPane.add(view);
					view.setVisible(true);
				}catch(IllegalArgumentException error){
					desktopPane.remove(view);
					desktopPane.add(view);
					view.setVisible(true);
				}
			}
		});
	}
	
	public void createFrame() {
		Window frame = new Window();
		frame.setVisible(true);
	}
}
