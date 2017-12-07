package TesteFactory;

public class JanelaExternaFactory extends JanelaFactory{

	public Jframe montarFrame() {
		return new Interna();
	}

}
