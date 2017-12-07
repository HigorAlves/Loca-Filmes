package View;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ClienteView extends JInternalFrame implements View {
	private static ClienteView INSTANCIA = null;
	
	private JLabel lbId;
	private JComboBox cbId;
	private JLabel lbNome;
	private JTextField tfNome;
	private JLabel lbSobrenome;
	private JTextField tfSobrenome;
	private JLabel lbIdade;
	private JTextField tfIdade;
	private JLabel lbEndereco;
	private JTextField tfEndereco;
	
	private JButton btSalvar;
	private JButton btAlterar;
	private JButton btDeletar;
	
	private JPanel pane;
	
	private JTable tabela;
	private JScrollPane tabelaRolagem;
	
	private ClienteView() {
		super("Clientes",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1300, 300);
		
		setContentPane(createGui());
	}
	
	private JPanel createGui() {
		lbId = new JLabel("ID:");
		cbId = new JComboBox<>();
		lbNome = new JLabel("Nome:");
		tfNome = new JTextField(10);
		lbSobrenome = new JLabel("Sobrenome:");
		tfSobrenome = new JTextField(10);
		lbIdade = new JLabel("Idade:");
		tfIdade = new JTextField(2);
		lbEndereco = new JLabel("Endereço:");
		tfEndereco = new JTextField(16);
		
		btSalvar = new JButton("Salvar");
		btAlterar = new JButton("Alterar");
		btDeletar = new JButton("Deletar");
		
		pane = new JPanel();
		
		pane.add(lbId);
		pane.add(cbId);
		pane.add(lbNome);
		pane.add(tfNome);
		pane.add(lbSobrenome);
		pane.add(tfSobrenome);
		pane.add(lbIdade);
		pane.add(tfIdade);
		pane.add(lbEndereco);
		pane.add(tfEndereco);
		pane.add(btSalvar);
		pane.add(btAlterar);
		pane.add(btDeletar);
		return pane;
	}
	
	public static ClienteView getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new ClienteView();
		}
		return INSTANCIA;
	}
}
