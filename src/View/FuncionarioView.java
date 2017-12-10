package View;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Interface.AbsFactory;
import Interface.AbsMainFactory;
import Model.TabelaFuncionarioModel;
import Model.TableModel;

public class FuncionarioView extends JInternalFrame implements View {
	private static FuncionarioView INSTANCIA = null;
	
	private JLabel lbID;
	private JComboBox cbId;
	private JLabel lbNome;
	private JTextField tfNome;
	private JLabel lbSobrenome;
	private JTextField tfSobrenome;
	private JLabel lbIdade;
	private JTextField tfIdade;
	private JLabel lbEndereco;
	private JTextField tfEndereco;
	private JLabel lbCargo;
	private JTextField tfCargo;
	private JLabel lbSalario;
	private JTextField tfSalario;
	
	private JButton btSalvar;
	private JButton btEditar;
	private JButton btDeletar;
	
	private TableModel tableModel;
	private JTable tabela;
	
	private JPanel pane;
	
	private FuncionarioView() {
		super("Funcionario",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1400, 300);
		
		setContentPane(createGui());
		actions();
	}
	
	private JPanel createGui() {
		pane = new JPanel();
		
		lbID = new JLabel("ID:");
		cbId = new JComboBox<>();
		lbNome = new JLabel("Nome:");
		tfNome = new JTextField(10);
		lbSobrenome = new JLabel("Sobrenome:");
		tfSobrenome = new JTextField(10);
		lbIdade = new JLabel("Idade:");
		tfIdade = new JTextField(2);
		lbEndereco = new JLabel("Endere�o:");
		tfEndereco = new JTextField(20);
		lbCargo = new JLabel("Cargo:");
		tfCargo = new JTextField(4);
		lbSalario = new JLabel("Salario:");
		tfSalario = new JTextField(4);
		btSalvar = new JButton("Salvar");
		btEditar = new JButton("Editar");
		btDeletar = new JButton("Deletar");
		
		tableModel =  new TabelaFuncionarioModel();
		tabela = new JTable();
		tabela.setModel((javax.swing.table.TableModel) tableModel);
		
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setPreferredSize(new Dimension(1300, 240));
		
		pane.add(lbID);
		pane.add(cbId);
		pane.add(lbNome);
		pane.add(tfNome);
		pane.add(lbSobrenome);
		pane.add(tfSobrenome);
		pane.add(lbIdade);
		pane.add(tfIdade);
		pane.add(lbEndereco);
		pane.add(tfEndereco);
		pane.add(lbCargo);
		pane.add(tfCargo);
		pane.add(lbSalario);
		pane.add(tfSalario);
		pane.add(btSalvar);
		pane.add(btEditar);
		pane.add(btDeletar);
		pane.add(barraRolagem); 
		
		return pane;
	}
	
	private void actions() {
		btSalvar.addActionListener(AbsFactory.getFactory("Funcionario").criarController(this, btSalvar));
	}
	
	public static synchronized FuncionarioView getInstancia() {
		if(INSTANCIA == null) {
			INSTANCIA = new FuncionarioView();
		}
		return INSTANCIA;
	 }
}
