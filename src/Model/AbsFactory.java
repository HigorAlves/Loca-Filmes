package Model;

import View.View;

public abstract class AbsFactory {
	public abstract void criarModelo();
	public abstract void criarController();
	public abstract View criarView();
	
	public static AbsFactory getFactory(String factory) {
		if(factory.equals("Funcionario")) {
			return new FuncionarioFactory();
		}else {
			return null;
		}
	}
}
