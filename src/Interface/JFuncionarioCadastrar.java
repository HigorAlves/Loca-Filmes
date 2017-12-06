package Interface;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JFuncionarioCadastrar extends JInternalFrame {
	private static JFuncionarioCadastrar INSTANCIA = null;
	
	private JFuncionarioCadastrar() {
		super("Funcionario - Cadastrar",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static synchronized JFuncionarioCadastrar getInstancia() {
		if(INSTANCIA == null) {
			INSTANCIA = new JFuncionarioCadastrar();
		}
		return INSTANCIA;
	 }
}
