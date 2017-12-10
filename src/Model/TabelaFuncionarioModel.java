package Model;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TabelaFuncionarioModel extends AbstractTableModel implements TableModel{
	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	
	private String[] colunas = {
			"ID","Nome","Sobrenome","Idade","Endereço","Cargo","Salario"
	};
	
	@Override
	public String getColumnName(int coluna) {
		return colunas[coluna];
	}
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return funcionarios.size();
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		switch(coluna) {
			case 0:
				return funcionarios.get(linha).getId();
			case 1:
				return funcionarios.get(linha).getNome();
			case 2:
				return funcionarios.get(linha).getSobrenome();
			case 3:
				return funcionarios.get(linha).getIdade();
			case 4:
				return funcionarios.get(linha).getEndereco();
			case 5:
				return funcionarios.get(linha).getCargo();
			case 6:
				return funcionarios.get(linha).getSalario();
		}
		return null;
	}
	
	public void addRow(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		this.fireTableDataChanged();
	}

}
