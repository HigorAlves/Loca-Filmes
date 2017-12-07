package Interface;

import View.View;
import View.ClienteView;

public class ClienteFactoryCadastro extends AbsFactory{

	@Override
	public void criarModelo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criarController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public View criarView() {
		return ClienteView.getInstancia();
	}

}
