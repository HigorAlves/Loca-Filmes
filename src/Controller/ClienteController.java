package Controller;

import Model.Cliente;
import Model.TableModelCliente;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import miscellaneous.FabricaAbstrata;

/**
 * @author Higor Alves
 */
public class ClienteController implements Controller{
    private Cliente cliente;
    
    public boolean addRow(JTextField nome, JTextField idade, TableModelCliente tableModel){
        try{
            cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
            cliente.setNome(nome.getText());
            cliente.setIdade(Integer.parseInt(idade.getText()));
            tableModel.addRow(cliente);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
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
    
    public void popUpSucesso(JPanel pane, String mensagem){
        JOptionPane.showMessageDialog(pane,mensagem, "Sucesso", JOptionPane.OK_OPTION);
    }
    public void popUpError(JPanel pane, String mensagem){
        JOptionPane.showMessageDialog(pane, mensagem, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
