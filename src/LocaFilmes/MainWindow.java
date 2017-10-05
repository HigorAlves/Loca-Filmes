package LocaFilmes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements MenuListener, ActionListener{
	FuncionarioWindow fw = new FuncionarioWindow();
	
	private JMenuBar menuBar;
	private JMenu funcionario, clientes, filmes;
	private JMenuItem fCadastrar, fAlterar, fListar, fExcluir, cCadastrar, cAlterar, cListar, cExcluir,
						fiCadastrar,fiAlterar, fiListar, fiExcluir;
	private JLabel lbl;
	private static int id;
	
	public void Show() {
		MainWindow frame = new MainWindow();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 125);
		frame.setTitle("LocaFilmes");
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		//Menu Funcionario
		menuBar = new JMenuBar();
		funcionario = new JMenu("Funcionario");
		fCadastrar = new JMenuItem("Cadastrar");
		fAlterar = new JMenuItem("Alterar");
		fListar = new JMenuItem("Listar");
		fExcluir = new JMenuItem("Excluir");
		funcionario.add(fCadastrar);
		funcionario.add(fAlterar);
		funcionario.add(fListar);
		funcionario.add(fExcluir);
		menuBar.add(funcionario);
		
		//Menu Clientes
		clientes = new JMenu("Clientes");
		cCadastrar = new JMenuItem("Cadastrar");
		cAlterar = new JMenuItem("Alterar");
		cListar = new JMenuItem("Listar");
		cExcluir = new JMenuItem("Excluir");
		clientes.add(cCadastrar);
		clientes.add(cAlterar);
		clientes.add(cListar);
		clientes.add(cExcluir);
		menuBar.add(clientes);
		
		//Menu Filmes
		filmes = new JMenu("Filmes");
		fiCadastrar = new JMenuItem("Cadastrar");
		fiAlterar = new JMenuItem("Alterar");
		fiListar = new JMenuItem("Listar");
		fiExcluir = new JMenuItem("Exluir");
		filmes.add(fiCadastrar);
		filmes.add(fiAlterar);
		filmes.add(fiListar);
		filmes.add(fiExcluir);
		menuBar.add(filmes);
		
		lbl = new JLabel("Quantidade de Funcionarios Cadastrados: " + (id));
		panel.add(lbl);
		
		fCadastrar.addActionListener(this);
		fAlterar.addActionListener(this);
		
		frame.setJMenuBar(menuBar);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(fCadastrar)) {
			id = fw.Cadastro(id);
			lbl.setText("Quantidade de Funcionarios Cadastrados: " + id);
		}
	}

	@Override
	public void menuSelected(MenuEvent e) {
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		
	}

	@Override
	public void menuCanceled(MenuEvent e) {
		
	}
	
	
}
