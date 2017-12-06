package Interface;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JFuncionarioCadastrar extends JInternalFrame {
	private static JFuncionarioCadastrar INSTANCIA = null;
	
	private JLabel lbID;
	private JTextField tfID;
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
	
	private JPanel pane;
	
	private JTable tabela;
	private JScrollPane tabelaRolagem;
	
	private String [] colunas = {
			"ID",
			"Nome",
			"Sobrenome",
			"Idade",
			"Endereço",
			"Cargo",
			"Salario"
	};
	
	//SOmente para teste da tabela
	private Object [][] dados = {
		{"01","Higor","Alves","20","Rua do Java","Dono","25.000"}
	};
	
	private JFuncionarioCadastrar() {
		super("Funcionario - Cadastrar",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1200, 200);
		
		setContentPane(createGui());
	}
	
	private JPanel createGui() {
		pane = new JPanel();
		
		lbID = new JLabel("ID:");
		tfID = new JTextField(2);
		lbNome = new JLabel("Nome:");
		tfNome = new JTextField(10);
		lbSobrenome = new JLabel("Sobrenome:");
		tfSobrenome = new JTextField(10);
		lbIdade = new JLabel("Idade:");
		tfIdade = new JTextField(10);
		lbEndereco = new JLabel("Endereço:");
		tfEndereco = new JTextField(20);
		lbCargo = new JLabel("Cargo:");
		tfCargo = new JTextField(6);
		lbSalario = new JLabel("Salario:");
		tfSalario = new JTextField(6);
		btSalvar = new JButton("Salvar");
		
		tabela = new JTable(dados, colunas);
		tabelaRolagem = new JScrollPane(tabela);
		tabelaRolagem.setPreferredSize(new Dimension(1150, 100));
		tabela.setEnabled(false);
		
		pane.add(lbID);
		pane.add(tfID);
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
		pane.add(tabelaRolagem);
		
		return pane;
	}
	
	public static synchronized JFuncionarioCadastrar getInstancia() {
		if(INSTANCIA == null) {
			INSTANCIA = new JFuncionarioCadastrar();
		}
		return INSTANCIA;
	 }
}
