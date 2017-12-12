package Controller;

import Model.Cliente;
import Model.TableModelCliente;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import miscellaneous.Database;
import miscellaneous.FabricaAbstrata;

/**
 * @author Higor Alves
 */
public class ClienteController implements Controller{
    private Cliente cliente;
    
    public boolean addRow(String nome, String idade){
        try{
            cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
            
            cliente.setId(Database.getInstancia().getClienteId());
            cliente.setNome(nome);
            cliente.setIdade(Integer.parseInt(idade));
            
            if (Database.getInstancia().addData(cliente)){
                Database.getInstancia().setClienteId(1);
            }else {
                return false;
            }
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    public boolean removerRow(int id){
        Database.getInstancia().removeData(id);
        return true;
    }
    public boolean alterarRow(int id, String nome, int idade, String newNome, int newIdade){
        cliente = (Cliente)FabricaAbstrata.getFabrica("cliente").criarModelo();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setIdade(idade);
        
        if (Database.getInstancia().editData(cliente)){
            int index = Database.getInstancia().getClientes().indexOf(cliente);
            cliente.setNome(newNome);
            cliente.setIdade(newIdade);
            Database.getInstancia().getClientes().set(index, cliente);
            return true;
        }
        return false;
    }
    
    //POPUPS PARA MANDAR MENSAGENS DE ERROR OU SUCESSO
    public void popUpSucesso(JPanel pane, String mensagem){
        JOptionPane.showMessageDialog(pane,mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    public void popUpError(JPanel pane, String titulo, String mensagem){
        JOptionPane.showMessageDialog(pane, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
    }
}
