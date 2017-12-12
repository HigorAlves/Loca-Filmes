package Controller;

import Model.Cliente;
import Model.Model;
import Model.TableModelCliente;
import javax.swing.JTable;
import javax.swing.JTextField;
import miscellaneous.FabricaAbstrata;

/**
 * @author Higor Alves
 */
public class ClienteController implements Controller{
    private Cliente cliente;
    
    public void addRow(JTextField nome, JTextField idade, TableModelCliente tableModel){
        cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
        cliente.setNome(nome.getText());
        cliente.setIdade(Integer.parseInt(idade.getText()));
        tableModel.addRow(cliente);
    }
    public void removerRow(JTable table, TableModelCliente tableModel){
        if(table.getSelectedRow() != -1){
            tableModel.removeRow(table.getSelectedRow());
        }
    }
    public void editRow(JTable table, TableModelCliente tableModel, JTextField nome, JTextField idade){
        if(table.getSelectedRow() != -1){
            tableModel.setValueAt(nome.getText(), table.getSelectedRow(), 1);
            tableModel.setValueAt(idade.getText(), table.getSelectedRow(), 2);
        }
    }
}
