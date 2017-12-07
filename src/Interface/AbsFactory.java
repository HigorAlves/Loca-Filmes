package Interface;

import View.View;

public abstract class AbsFactory {
	public abstract void criarModelo();
	public abstract void criarController();
	public abstract View criarView();
	
	public static AbsFactory getFactory(String factory) {
		if(factory.equals("Funcionario")) {
			return new FuncionarioFactory();
		}if(factory.equals("Filme")) {
			return new FilmeFactory();
		}if(factory.equals("Cliente")){
			return new ClienteFactoryCadastro();
		}else {
			return null;
		}
	}
}
