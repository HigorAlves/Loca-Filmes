package LocaFilmes;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;

public class InternalFuncionario extends JInternalFrame{
	
	private JPanel guiPane;
	private JLabel nome;
	private JLabel sobreNome;
	private JLabel idade;
	private JLabel cargo;
	private JLabel endereco;
	private JLabel selecionarLabel;
	
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtEndereco;
	
	private JButton btCadastrar;
	private JButton btDeletar;
	private JButton btAlterar;
	
	private JComboBox selecionar;
	
	private JTable tabela;
	private JScrollPane rolagemTabela;
	
	private String colunas[] = {"Identificador", "Nome", "Sobrenome", "Idade", "Cargo", "Endereço"};
	
	Object [][] dados = {
	        {"1", "Higor", "Alves", "20", "CEO", "Helder Valerio"}
	    };
	
	private void createGui() {
		selecionarLabel = new JLabel("Selecione para editar:");
		selecionar = new JComboBox<>();
		selecionar.setMaximumRowCount(10);
		selecionar.setToolTipText("");
		selecionar.setModel(new DefaultComboBoxModel(new String[] {"0"}));
		selecionar.setSelectedIndex(0);
		
		nome = new JLabel("Nome:");
		sobreNome = new JLabel("Sobrenome:");
		idade = new JLabel("Idade:");
		cargo = new JLabel("Cargo:");
		endereco = new JLabel("Endereço:");
		
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		
		btCadastrar = new JButton("Novo cadastro");
		btAlterar = new JButton("Alterar");
		btDeletar = new JButton("Deletar");
		
		tabela = new JTable(dados, colunas);
		tabela.setDefaultEditor(Object.class, null);
		tabela.setCellSelectionEnabled(true);
		tabela.setBorder(new EmptyBorder(0, 0, 0, 0));
		rolagemTabela = new JScrollPane(tabela);
		rolagemTabela.setPreferredSize(new Dimension(1000, 400));
		
		guiPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		guiPane.add(selecionarLabel);
		guiPane.add(selecionar);
		guiPane.add(nome);
		guiPane.add(txtNome);
		guiPane.add(sobreNome);
		guiPane.add(txtSobrenome);
		guiPane.add(idade);
		guiPane.add(txtIdade);
		guiPane.add(cargo);
		guiPane.add(txtCargo);
		guiPane.add(endereco);
		guiPane.add(txtEndereco);
		guiPane.add(rolagemTabela);
		guiPane.add(btCadastrar);
		guiPane.add(btAlterar);
		guiPane.add(btDeletar);
	}
	
	/**
	 * Create the frame.
	 */
	public InternalFuncionario() {
		setClosable(true);
		setTitle("Funcionarios");
		setMaximizable(true);
		setBounds(100, 100, 1100, 600);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		
		guiPane = new JPanel();
		guiPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(guiPane);
		createGui();
	}

}
