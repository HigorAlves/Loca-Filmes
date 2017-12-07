package TesteFactory;

public class TesteFactory {
	private static Janela montarFrame(String janela) {
		JanelaFactory JF = null;
		switch(janela) {
			case "Interna":
				JF = new JanelaExternaFactory();
				break;
		}
		Janela fjanela = new Janela();
		fjanela.setJanela(JF.montarFrame());
		return fjanela;
	}
	
	public static void main(String[] args) {
		Janela j1 = montarFrame("Interna");
	}
}
