package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.FilmeController;
import Interface.AbsFactory;
import Interface.FilmeFactory;

public class FilmeView extends JInternalFrame implements View {
	private static FilmeView INSTANCIA = null;
	
	private JLabel lbId;
	private JComboBox cbId;
	private JLabel lbNome;
	private JTextField tfNome;
	private JLabel lbFaixaEtaria;
	private JTextField tfFaixaEtaria;
	private JLabel lbDuracao;
	private JTextField tfDuracao;
	private JLabel lbTema;
	private JTextField tfTema;
	
	private JButton btSalvar;
	private JButton btEditar;
	private JButton btDeletar;
	
	private JPanel pane;
	
	private FilmeView() {
		super("Filme",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1300,300);
		
		setContentPane(createGui());
		actions();
	}
	
	private JPanel createGui() {
		lbId = new JLabel("ID:");
		cbId = new JComboBox<>();
		lbNome = new JLabel("Nome:");
		tfNome = new JTextField(12);
		lbFaixaEtaria = new JLabel("Faixa Etaria:");
		tfFaixaEtaria = new JTextField(5);
		lbDuracao = new JLabel("Duração:");
		tfDuracao = new JTextField(4);
		lbTema = new JLabel("Tema:");
		tfTema = new JTextField(10);
		
		btSalvar = new JButton("Salvar");
		btEditar = new JButton("Editar");
		btDeletar = new JButton("Deletar");
		
		pane = new JPanel();
		
		pane.add(lbId);
		pane.add(cbId);
		pane.add(lbNome);
		pane.add(tfNome);
		pane.add(lbFaixaEtaria);
		pane.add(tfFaixaEtaria);
		pane.add(lbDuracao);
		pane.add(tfDuracao);
		pane.add(lbTema);
		pane.add(tfTema);
		pane.add(btSalvar);
		pane.add(btEditar);
		pane.add(btDeletar);
		
		return pane;
	}
	
	private void actions() {
		btSalvar.addActionListener(AbsFactory.getFactory("Filme").criarController(this, btSalvar));
	}
	public static FilmeView getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new FilmeView();
		}
		return INSTANCIA;
	}
}
