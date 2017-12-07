package View;

import javax.swing.JInternalFrame;

public class FilmeView extends JInternalFrame implements View {
	private static FilmeView INSTANCIA = null;
	
	private FilmeView() {
		
	}
	
	public static FilmeView getInstancia() {
		if (INSTANCIA == null) {
			INSTANCIA = new FilmeView();
		}
		return INSTANCIA;
	}
}
