package Controller;

import Model.Cliente;
import Model.TableModelCliente;
import javax.swing.JTable;
import javax.swing.JTextField;
import miscellaneous.FabricaAbstrata;

/**
 * @author Higor Alves
 */
public class ClienteController implements Controller{
    private Cliente cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
    
    public void addRow(JTextField nome, JTextField idade, TableModelCliente tableModel){
        cliente.setNome(idade.getText());
        cliente.setIdade(Integer.parseInt(idade.getText()));
        tableModel.addRow(cliente);
    }
    public void removerRow(JTable table, TableModelCliente tableModel){
        if(table.getSelectedRow() != -1){
            tableModel.removeRow(table.getSelectedRow());
        }
    }
}
