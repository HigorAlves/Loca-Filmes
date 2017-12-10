package View;

public class ClienteAlugarView implements View {
	private static ClienteAlugarView instancia = null;
	
	private ClienteAlugarView() {
		
	}
	
	public static ClienteAlugarView getInstancia() {
		if(instancia == null) {
			instancia = new ClienteAlugarView();
		}
		return instancia;
	}
}
