package View;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class FilmeView extends JInternalFrame implements View {
	private static FilmeView INSTANCIA = null;
	
	private JPanel pane;
	
	private FilmeView() {
		super("Filme",true,true,true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1300,300);
		
		setContentPane(createGui());
	}
	
	private JPanel createGui() {
		return pane;
	}
	
	public static FilmeView getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new FilmeView();
		}
		return INSTANCIA;
	}
}
