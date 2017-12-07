package Interface;

import View.FuncionarioView;

public class FuncionarioFactory extends AbsFactory{

	@Override
	public void criarModelo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criarController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FuncionarioView criarView() {
		return FuncionarioView.getInstancia();
	}

}
