package Model;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Higor Alves
 */
public class TableModelCliente extends AbstractTableModel {
    private List<Cliente> clientes = new LinkedList<>();
    private String[] colunas = {"ID","Nome","Idade"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return clientes.get(linha).getId();
            case 1:
                return clientes.get(linha).getNome();
            case 2:
                return clientes.get(linha).getIdade();
            default:
                return null;
        }
    }
    
    public void addRow(Cliente cliente){
        this.clientes.add(cliente);
        this.fireTableDataChanged();
    }
}
